package org.coode.parsers.ui;

import static org.coode.oppl.utils.ArgCheck.checkNotNull;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

import org.semanticweb.owlapi.model.OWLOntologyManager;

/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: May 4, 2006<br>
 * <br>
 * <br>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br>
 * <br>
 * <br>
 * An editor that can be used to edit text containing class expressions. The
 * editor is backed by a parser that checks that the text is well formed and
 * provides feedback if the text is not well formed.
 * 
 * @param <O>
 *        type
 */
public class ExpressionEditor<O> extends JTextPane implements RefreshableComponent,
    VerifiedInputEditor {

    private static final int CHECK_DELAY = 500;
    private static final long serialVersionUID = 20100L;
    protected final KeywordColourMap keywordColourMap = new KeywordColourMap();
    private Border outerBorder;
    private final Border defaultBorder;
    private Border stateBorder;
    private final Border errorBorder;
    private final Stroke errorStroke;
    private final DocumentListener docListener;
    private int errorStartIndex;
    private int errorEndIndex;
    private final Timer timer;
    private static final int DEFAULT_TOOL_TIP_INITIAL_DELAY = ToolTipManager
        .sharedInstance().getInitialDelay();
    private static final String DEFAULT_FONT_NAME = "Dialog";
    private static final int DEFAULT_TOOL_TIP_DISMISS_DELAY = ToolTipManager
        .sharedInstance().getDismissDelay();
    private static final int ERROR_TOOL_TIP_INITIAL_DELAY = 100;
    private static final int ERROR_TOOL_TIP_DISMISS_DELAY = 9000;
    private final ExpressionChecker<O> expressionChecker;
    private final OWLOntologyManager ontologyMmanager;

    /**
     * @param manager
     *        manager
     * @param checker
     *        checker
     */
    public ExpressionEditor(OWLOntologyManager manager, ExpressionChecker<O> checker) {
        this.ontologyMmanager = checkNotNull(manager, "manager");
        this.outerBorder = null;
        this.expressionChecker = checkNotNull(checker, "checker");
        this.defaultBorder = BorderFactory
            .createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY);
        this.setStateBorder(this.defaultBorder);
        this.errorBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED);
        this.errorStroke = new BasicStroke(3.0f, BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_ROUND, 3.0f, new float[] { 4.0f, 2.0f }, 0.0f);
        this.docListener = new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                ExpressionEditor.this.handleDocumentUpdated();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ExpressionEditor.this.handleDocumentUpdated();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        };
        getDocument().addDocumentListener(this.docListener);
        this.timer = new Timer(ExpressionEditor.CHECK_DELAY, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ExpressionEditor.this.handleTimer();
            }
        });
        this.getInputMap().put(
            KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit()
                .getMenuShortcutKeyMask()), new AbstractAction() {

                    private static final long serialVersionUID = 20100L;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Do nothing just swallow the undo event when the text
                        // pane is on focus
                    }
                });
        this.refreshComponent();
        this.createStyles();
    }

    @Override
    public void refreshComponent() {
        setFont(new Font(DEFAULT_FONT_NAME, Font.PLAIN, 14));
    }

    /**
     * @param desc
     *        desc
     */
    public void setExpressionObject(O desc) {
        if (desc == null) {
            setText("");
        } else {
            setText(desc.toString());
        }
    }

    /**
     * @return expression checker
     */
    public ExpressionChecker<O> getExpressionChecker() {
        return this.expressionChecker;
    }

    /**
     * @return create object
     */
    public O createObject() {
        return this.expressionChecker.createObject(this.getText());
    }

    /**
     * @param border
     *        border
     */
    public void setStateBorder(Border border) {
        this.stateBorder = border;
        super.setBorder(BorderFactory.createCompoundBorder(this.outerBorder,
            this.stateBorder));
    }

    @Override
    public void setBorder(Border border) {
        this.outerBorder = border;
        // Override to set the outer border
        super.setBorder(BorderFactory.createCompoundBorder(this.outerBorder,
            this.stateBorder));
    }

    private void clearError() {
        setToolTipText(null);
        this.setStateBorder(this.defaultBorder);
        this.setErrorRange(0, 0);
        ToolTipManager.sharedInstance().setInitialDelay(DEFAULT_TOOL_TIP_INITIAL_DELAY);
        ToolTipManager.sharedInstance().setDismissDelay(DEFAULT_TOOL_TIP_DISMISS_DELAY);
    }

    protected void checkExpression() {
        // Parse the text in the editor. If no parse
        // exception is thrown, clear the error, otherwise
        // set the error
        this.expressionChecker.check(this.getText());
        this.setError(this.expressionChecker.getErrorReport());
    }

    protected void handleTimer() {
        this.timer.stop();
        this.checkExpression();
    }

    protected void handleDocumentUpdated() {
        this.timer.restart();
        this.clearError();
        this.performHighlighting();
        this.notifyValidationChanged(false); // updates always disable until
        // parsed
    }

    private void setError(ErrorReport e) {
        this.notifyValidationChanged(e == null); // if no error, then content is
        // valid
        if (e != null) {
            ToolTipManager.sharedInstance().setInitialDelay(ERROR_TOOL_TIP_INITIAL_DELAY);
            ToolTipManager.sharedInstance().setDismissDelay(ERROR_TOOL_TIP_DISMISS_DELAY);
            setToolTipText(getHTMLErrorMessage(e.getMessage()));
            this.setStateBorder(this.errorBorder);
            int start = e.getLinearisedPosition(this.getText());
            this.setErrorRange(start, e.getLength() + start);
        } else {
            this.clearError();
        }
    }

    private void setErrorRange(int startIndex, int endIndex) {
        this.errorStartIndex = startIndex;
        this.errorEndIndex = endIndex;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color oldColor = g.getColor();
        try {
            // Paint in error range if there is one
            if (this.errorStartIndex != this.errorEndIndex && this.errorStartIndex > -1
                && this.errorStartIndex < getDocument().getLength()) {
                Rectangle start = modelToView(this.errorStartIndex);
                Rectangle end = modelToView(this.errorEndIndex);
                g.setColor(Color.RED);
                ((Graphics2D) g).setStroke(this.errorStroke);
                int y = end.y + end.height;
                g.drawLine(start.x, y, end.x + end.width, y);
            }
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        g.setColor(oldColor);
    }

    private void performHighlighting() {
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    final int lineStartIndex = 0;
                    final int lineEndIndex = ExpressionEditor.this.getDocument()
                        .getLength();
                    if (lineEndIndex - lineStartIndex < 0) {
                        return;
                    }
                    StringTokenizer tokenizer = new StringTokenizer(ExpressionEditor.this
                        .getDocument().getText(lineStartIndex,
                            lineEndIndex - lineStartIndex), " ()[]{},\n\t.'",
                        true);
                    int index = lineStartIndex;
                    boolean inEscapedName = false;
                    while (tokenizer.hasMoreTokens()) {
                        String curToken = tokenizer.nextToken();
                        if (curToken.equals("'")) {
                            if (inEscapedName) {
                                inEscapedName = false;
                            } else {
                                inEscapedName = true;
                            }
                        }
                        if (!inEscapedName) {
                            Color color = ExpressionEditor.this.keywordColourMap
                                .get(curToken);
                            if (color == null) {
                                color = Color.BLACK;
                            }
                            ExpressionEditor.this.getStyledDocument()
                                .setCharacterAttributes(
                                    index,
                                    curToken.length(),
                                    ExpressionEditor.this.getStyledDocument()
                                        .getStyle(color.toString()), true);
                        }
                        index += curToken.length();
                    }
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

    private static String getHTMLErrorMessage(String msg) {
        return "<html><body>"
            + msg.replace("\n", "<br>").replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;")
            + "</body></html>";
    }

    private void createStyles() {
        for (Color color : this.keywordColourMap.values()) {
            Style style = getStyledDocument().addStyle(color.toString(), null);
            StyleConstants.setForeground(style, color);
            StyleConstants.setBold(style, true);
        }
        StyleConstants.setForeground(
            getStyledDocument().addStyle(Color.BLACK.toString(), null), Color.BLACK);
    }

    // /////////////////////// content verification
    private final Set<InputVerificationStatusChangedListener> listeners = new HashSet<>();
    private boolean previousValue = true;

    @Override
    public void addStatusChangedListener(InputVerificationStatusChangedListener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeStatusChangedListener(
        InputVerificationStatusChangedListener listener) {
        this.listeners.remove(listener);
    }

    private void notifyValidationChanged(boolean valid) {
        if (valid != this.previousValue) { // only report changes
            this.previousValue = valid;
            for (InputVerificationStatusChangedListener l : this.listeners) {
                l.verifiedStatusChanged(valid);
            }
        }
    }

    /**
     * @return the ontologyMmanager
     */
    public OWLOntologyManager getOntologyManager() {
        return this.ontologyMmanager;
    }
}
