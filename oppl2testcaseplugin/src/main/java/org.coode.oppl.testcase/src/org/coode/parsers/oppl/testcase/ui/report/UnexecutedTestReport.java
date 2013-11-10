/**
 * 
 */
package org.coode.parsers.oppl.testcase.ui.report;

import java.util.Formatter;

import org.coode.parsers.oppl.testcase.OPPLTestCase;
import org.coode.parsers.oppl.testcase.Test;

/**
 * Represents a report about a Test that has not been yet executed.
 * 
 * @author Luigi Iannone
 * 
 */
public class UnexecutedTestReport extends AbstractReport {
	private final Test unexecutedTest;

	/**
	 * @param opplTestCase
	 * @param unexecutedTest
	 */
	public UnexecutedTestReport(OPPLTestCase opplTestCase, Test unexecutedTest) {
		super(opplTestCase);
		if (unexecutedTest == null) {
			throw new NullPointerException("The unexecuted test cannot be null");
		}
		this.unexecutedTest = unexecutedTest;
	}

	/**
	 * @see org.coode.parsers.oppl.testcase.ui.report.Report#accept(org.coode.parsers
	 *      .oppl.testcase.ui.report.ReportVisitor)
	 */
	public void accept(ReportVisitor visitor) {
		visitor.visitUnexecutedTestReport(this);
	}

	/**
	 * @see org.coode.parsers.oppl.testcase.ui.report.Report#accept(org.coode.parsers
	 *      .oppl.testcase.ui.report.ReportVisitorEx)
	 */
	public <O> O accept(ReportVisitorEx<O> visitor) {
		return visitor.visitUnexecutedTestReport(this);
	}

	/**
	 * @return the unexecutedTest
	 */
	public Test getUnexecutedTest() {
		return this.unexecutedTest;
	}

	@Override
	public String toString() {
		Formatter formatter = new Formatter();
		formatter.format("UNEXECUTED %s", this.getUnexecutedTest());
		return formatter.toString();
	}
}