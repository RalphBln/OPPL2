package org.coode.oppl.protege.ui;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.RewriteEmptyStreamException;
import org.coode.parsers.ErrorListener;
import org.coode.parsers.Type;
import org.coode.parsers.ui.AbstractLinearisingErrorReport;
import org.coode.parsers.ui.ErrorReport;
import org.coode.parsers.ui.ExpressionChecker;
import org.protege.editor.owl.OWLEditorKit;

public abstract class OPPLExpressionChecker<O> implements ExpressionChecker<O> {
	private final class ErrorReportImpl extends AbstractLinearisingErrorReport {
		private final String message;
		private final int charPositionInLine;
		private final int line;
		private final int length;

		/**
		 * @param message
		 * @param charPositionInline
		 * @param endIndex
		 */
		public ErrorReportImpl(String message, int line,
				int charPositionInline, int length) {
			if (message == null) {
				throw new NullPointerException("The message cannot be null");
			}
			this.message = message;
			this.charPositionInLine = charPositionInline;
			this.line = line;
			this.length = length;
		}

		/**
		 * @return the message
		 */
		public String getMessage() {
			return this.message;
		}

		/**
		 * @return the startIndex
		 */
		public int getCharPositionInLine() {
			return this.charPositionInLine;
		}

		/**
		 * @return the line
		 */
		public int getLine() {
			return this.line;
		}

		/**
		 * @return the length
		 */
		public int getLength() {
			return this.length;
		}
	}

	private final class OPPLExpressionCheckerErrorListener implements
			ErrorListener {
		public void clear() {
			OPPLExpressionChecker.this.lastReport = null;
		}

		public void reportThrowable(Throwable t, int line, int charPosInLine,
				int length) {
			if (OPPLExpressionChecker.this.lastReport == null) {
				OPPLExpressionChecker.this.lastReport = new ErrorReportImpl(t
						.getMessage() == null ? "" : t.getMessage(), line,
						charPosInLine, length);
			}
		}

		public void unrecognisedSymbol(CommonTree t) {
			if (OPPLExpressionChecker.this.lastReport == null) {
				OPPLExpressionChecker.this.lastReport = new ErrorReportImpl(
						"Unrecognised token " + t.getText(), t.getLine(), t
								.getCharPositionInLine(), t.getText().length());
			}
		}

		public void recognitionException(RecognitionException e) {
			if (OPPLExpressionChecker.this.lastReport == null) {
				String message = e.getMessage() == null ? "Incomplete string"
						: e.getMessage();
				int endIndex = e.token.getText() == null ? 0 : e.token
						.getText().length();
				String onToken = e.token.getText() == null ? "" : " on token "
						+ e.token.getText();
				OPPLExpressionChecker.this.lastReport = new ErrorReportImpl(
						message + onToken, e.line, e.charPositionInLine,
						endIndex);
			}
		}

		public void recognitionException(RecognitionException e,
				String... tokenNames) {
			if (OPPLExpressionChecker.this.lastReport == null) {
				String message = "Recognition exception on the token "
						+ e.token + e.getClass().getSimpleName();
				int endIndex = e.token.getText() == null ? 0 : e.token
						.getText().length();
				OPPLExpressionChecker.this.lastReport = new ErrorReportImpl(
						message, e.line, e.charPositionInLine, endIndex);
			}
		}

		public void rewriteEmptyStreamException(RewriteEmptyStreamException e) {
			if (OPPLExpressionChecker.this.lastReport == null) {
				OPPLExpressionChecker.this.lastReport = new ErrorReportImpl(e
						.getMessage().replaceAll("rule",
								"Incomplete or missing "), 0, 0, 0);
			}
		}

		public void incompatibleSymbols(CommonTree parentExpression,
				CommonTree... expressions) {
			if (OPPLExpressionChecker.this.lastReport == null) {
				StringBuilder builder = new StringBuilder();
				builder.append("[");
				boolean first = true;
				for (CommonTree expression : expressions) {
					String comma = first ? "" : ", ";
					first = false;
					builder.append(comma);
					builder.append(expression.getText() == null ? ""
							: expression.getText());
				}
				builder.append("]");
				OPPLExpressionChecker.this.lastReport = new ErrorReportImpl(
						"Incompatible children expressions: "
								+ builder.toString()
								+ " for the parent expression  "
								+ parentExpression.getText(), parentExpression
								.getLine(), parentExpression
								.getCharPositionInLine(), parentExpression
								.getText().length());
			}
		}

		public void incompatibleSymbolType(CommonTree t, Type type,
				CommonTree expression) {
			if (OPPLExpressionChecker.this.lastReport == null) {
				OPPLExpressionChecker.this.lastReport = new ErrorReportImpl(
						"Incompatible type: " + type + "  for token: "
								+ t.getText() + " for the parent expression "
								+ expression.getText(), t.getLine(), t
								.getCharPositionInLine(), t.getText().length());
			}
		}

		public void illegalToken(CommonTree t, String message) {
			if (OPPLExpressionChecker.this.lastReport == null) {
				OPPLExpressionChecker.this.lastReport = new ErrorReportImpl(
						"Illegal token: " + t.getText() + " " + message, t
								.getLine(), t.getCharPositionInLine(), t
								.getText().length());
			}
		}
	}

	private final OWLEditorKit owlEditorKit;
	private final OPPLExpressionCheckerErrorListener listener = new OPPLExpressionCheckerErrorListener();
	private O lastObject = null;
	private ErrorReport lastReport = null;

	/**
	 * @param owlEditorKit
	 */
	public OPPLExpressionChecker(OWLEditorKit owlEditorKit) {
		if (owlEditorKit == null) {
			throw new NullPointerException("The OWL editor kit cannot be null");
		}
		this.owlEditorKit = owlEditorKit;
	}

	public void check(String text) {
		this.reset();
		this.lastObject = this.parse(text);
	}

	protected abstract O parse(String text);

	public O createObject(String text) {
		this.check(text);
		return this.lastObject;
	}

	public ErrorReport getErrorReport() {
		return this.lastReport;
	}

	/**
	 * 
	 */
	private void reset() {
		this.lastObject = null;
		this.lastReport = null;
		this.listener.clear();
	}

	/**
	 * @return the owlEditorKit
	 */
	public OWLEditorKit getOWLEditorKit() {
		return this.owlEditorKit;
	}

	/**
	 * @return the listener
	 */
	public ErrorListener getListener() {
		return this.listener;
	}
}