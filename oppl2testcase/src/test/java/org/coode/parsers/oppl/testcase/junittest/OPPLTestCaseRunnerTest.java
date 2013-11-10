package org.coode.parsers.oppl.testcase.junittest;

import static org.junit.Assert.fail;

import java.util.regex.PatternSyntaxException;

import junit.framework.TestCase;

import org.coode.oppl.Ontologies;
import org.coode.oppl.exceptions.RuntimeExceptionHandler;
import org.coode.parsers.ErrorListener;
import org.coode.parsers.oppl.testcase.JUnitTestCaseRunner;
import org.coode.parsers.oppl.testcase.OPPLTest;
import org.coode.parsers.oppl.testcase.OPPLTestCase;
import org.coode.parsers.oppl.testcase.OPPLTestCaseParser;
import org.coode.parsers.oppl.testcase.ParserFactory;
import org.coode.parsers.oppl.testcase.TestCaseRunner;
import org.coode.parsers.test.JUnitTestErrorListener;
import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

import uk.ac.manchester.cs.jfact.JFactFactory;

public class OPPLTestCaseRunnerTest {
    Ontologies ontologies=new Ontologies();
    private final class JunitConfigShouldFailTestCaseRunner extends TestCaseRunner {
        /** @param opplTestCase */
        public JunitConfigShouldFailTestCaseRunner(OPPLTestCase opplTestCase) {
            super(opplTestCase);
        }

        /** @see org.coode.parsers.oppl.testcase.TestCaseRunner#fail(org.coode.parsers.oppl.testcase.OPPLTest) */
        @Override
        protected void fail(OPPLTest test) {
            TestCase.fail("The configuration should fail and the tests should not be carried out, but they have been instead ");
        }

        @Override
        protected void configurationFailed(String message) {}

        /** @see org.coode.parsers.oppl.testcase.TestCaseRunner#fail(java.lang.Throwable) */
        @Override
        protected void fail(Throwable e) {
            TestCase.fail("The configuration should fail and the query  should not be carried out, but it has and an exception was raised in the process "
                    + e.getMessage());
        }

        /** @see org.coode.parsers.oppl.testcase.TestCaseRunner#success(org.coode.parsers.oppl.testcase.OPPLTest) */
        @Override
        protected void success(OPPLTest test) {
            TestCase.fail("The configuration should fail and the tests should not be carried out, but they have been instead ");
        }
    }

    private final class JunitShouldFailTestCaseRunner extends TestCaseRunner {
        /** @param opplTestCase */
        public JunitShouldFailTestCaseRunner(OPPLTestCase opplTestCase) {
            super(opplTestCase);
        }

        /** @see org.coode.parsers.oppl.testcase.TestCaseRunner#fail(org.coode.parsers.oppl.testcase.OPPLTest) */
        @Override
        protected void fail(OPPLTest test) {}

        @Override
        protected void configurationFailed(String message) {
            TestCase.fail("The configuration should be fine, it fails instead with the following message: "
                    + message);
        }

        /** @see org.coode.parsers.oppl.testcase.TestCaseRunner#fail(java.lang.Throwable) */
        @Override
        protected void fail(Throwable e) {}

        /** @see org.coode.parsers.oppl.testcase.TestCaseRunner#success(org.coode.parsers.oppl.testcase.OPPLTest) */
        @Override
        protected void success(OPPLTest test) {
            TestCase.fail("Test " + test + " sould fail; it succeded instead");
        }
    }

    private static final ErrorListener ERROR_LISTENER = new JUnitTestErrorListener();
    private static final RuntimeExceptionHandler HANDLER = new RuntimeExceptionHandler() {
        public void handlePatternSyntaxExcpetion(PatternSyntaxException e) {
            ERROR_LISTENER.reportThrowable(e, 0, 0, 0);
        }

        public void handleOWLRuntimeException(OWLRuntimeException e) {
            ERROR_LISTENER.reportThrowable(e, 0, 0, 0);
        }

        public void handleException(RuntimeException e) {
            ERROR_LISTENER.reportThrowable(e, 0, 0, 0);
        }
    };

    @Test
    public void testCount() {
        String testCase = "testOneAssertion; ?x:CLASS SELECT ?x subClassOf Pizza ASSERT count(?x) = 1; ?x count is not 1;";
       
            ParserFactory parserFactory = new ParserFactory(ontologies.pizza,
ontologies.manager);
            OPPLTestCaseParser parser = parserFactory.build(ERROR_LISTENER);
            OPPLTestCase opplTestCase = parser.parse(testCase, HANDLER);
            this.runTestCase(opplTestCase);
    }

    @Test
    public void testCountInference() {
        String testCase = "testOneAssertion; INFERENCE; ?x:CLASS SELECT ?x subClassOf InterestingPizza WHERE ?x!=InterestingPizza, FAIL ?x equivalentTo Nothing  ASSERT count(?x) = 20; ?x count is not 20;";

            JFactFactory reasonerFactory = new JFactFactory();
            OWLReasoner reasoner = reasonerFactory.createReasoner(ontologies.pizza);
            
            ParserFactory parserFactory = new ParserFactory(ontologies.pizza,
ontologies.manager,reasoner);
            OPPLTestCaseParser parser = parserFactory.build(ERROR_LISTENER);
            OPPLTestCase opplTestCase = parser.parse(testCase, HANDLER);
            this.runTestCase(opplTestCase);
    }

    @Test
    public void testCountShouldFail() {
        String testCase = "testOneAssertion; ?x:CLASS SELECT ?x subClassOf Pizza ASSERT count(?x) != 1; ?x count is 1;";
            
            ParserFactory parserFactory = new ParserFactory(ontologies.pizza,
ontologies.manager);

            OPPLTestCaseParser parser = parserFactory.build(ERROR_LISTENER);
            OPPLTestCase opplTestCase = parser.parse(testCase, HANDLER);
            this.runTestCase(opplTestCase, false);
    }

    @Test
    public void testConfigurationNotOK() {
        String testCase = "testOneAssertion; INFERENCE; ?x:CLASS SELECT ?x subClassOf Pizza ASSERT count(?x) != 1; ?x count is 1;";
        
        ParserFactory parserFactory = new ParserFactory(ontologies.pizza,
ontologies.manager);

            OPPLTestCaseParser parser = parserFactory.build(ERROR_LISTENER);
            OPPLTestCase opplTestCase = parser.parse(testCase, HANDLER);
            TestCaseRunner runner = new JunitConfigShouldFailTestCaseRunner(opplTestCase);
            runner.run();
    }

    private void runTestCase(OPPLTestCase opplTestCase) {
        this.runTestCase(opplTestCase, true);
    }

    /** @param opplTestCase */
    private void runTestCase(OPPLTestCase opplTestCase, boolean shouldSucceed) {
        TestCaseRunner runner = shouldSucceed ? new JUnitTestCaseRunner(opplTestCase)
                : new JunitShouldFailTestCaseRunner(opplTestCase);
        runner.run();
    }
}