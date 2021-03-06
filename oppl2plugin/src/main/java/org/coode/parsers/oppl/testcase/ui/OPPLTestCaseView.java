package org.coode.parsers.oppl.testcase.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.Collections;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

import org.coode.parsers.oppl.testcase.OPPLTestCase;
import org.coode.parsers.oppl.testcase.protege.OPPLTestCaseAnnotationContainer;
import org.protege.editor.core.ui.util.ComponentFactory;
import org.protege.editor.owl.ui.view.AbstractActiveOntologyViewComponent;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * @author Luigi Iannone
 */
public class OPPLTestCaseView extends AbstractActiveOntologyViewComponent {

    private static final long serialVersionUID = 20100L;
    private OPPLTestCaseList list;
    protected final OPPLTestCaseRunPanel testCaseRunPanel = new OPPLTestCaseRunPanel();
    private AbstractAllOPPLTestCaseAction runAllTestAction;

    @Override
    protected void initialiseOntologyView() {
        setLayout(new BorderLayout());
        JSplitPane mainPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        mainPanel.setDividerLocation(.5);
        mainPanel.setResizeWeight(.5);
        list = new OPPLTestCaseList(getOWLEditorKit()) {

            private static final long serialVersionUID = 20100L;

            @Override
            protected void runTest(OPPLTestCase opplTestCase) {
                testCaseRunPanel.runTests(Collections.singleton(opplTestCase));
            }
        };
        list.setRootObject(new OPPLTestCaseAnnotationContainer(getOWLEditorKit()));
        JScrollPane listPane = ComponentFactory.createScrollPane(list);
        runAllTestAction = new AbstractAllOPPLTestCaseAction("Run All", getOWLEditorKit()) {

            private static final long serialVersionUID = 20100L;

            @Override
            public void actionPerformed(ActionEvent e) {
                testCaseRunPanel.runTests(getOPPLTestCases());
            }
        };
        JToolBar toolBar = ComponentFactory.createViewToolBar();
        toolBar.add(runAllTestAction);
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(listPane, BorderLayout.CENTER);
        leftPanel.add(toolBar, BorderLayout.NORTH);
        mainPanel.setLeftComponent(leftPanel);
        mainPanel.setRightComponent(testCaseRunPanel);
        this.add(mainPanel);
    }

    @Override
    protected void disposeOntologyView() {
        if (list != null) {
            list.dispose();
        }
        if (runAllTestAction != null) {
            runAllTestAction.dispose();
        }
    }

    @Override
    protected void updateView(OWLOntology activeOntology) {
        list.setRootObject(new OPPLTestCaseAnnotationContainer(getOWLEditorKit()));
    }
}
