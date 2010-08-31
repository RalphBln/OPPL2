/**
 * Copyright (C) 2008, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.coode.oppl.protege.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.coode.oppl.ConstraintSystem;
import org.coode.oppl.ManchesterVariableSyntax;
import org.coode.oppl.OPPLParser;
import org.coode.oppl.PlainVariableVisitor;
import org.coode.oppl.Variable;
import org.coode.oppl.VariableScope;
import org.coode.oppl.VariableScopeChecker;
import org.coode.oppl.VariableType;
import org.coode.oppl.VariableTypeVisitorEx;
import org.coode.oppl.VariableVisitor;
import org.coode.oppl.exceptions.InvalidVariableNameException;
import org.coode.oppl.generated.RegExpGenerated;
import org.coode.oppl.protege.ProtegeParserFactory;
import org.coode.parsers.oppl.OPPLSymbolTable;
import org.coode.parsers.ui.ExpressionEditor;
import org.coode.parsers.ui.InputVerificationStatusChangedListener;
import org.protege.editor.core.ui.util.ComponentFactory;
import org.protege.editor.owl.OWLEditorKit;
import org.protege.editor.owl.model.description.OWLExpressionParserException;
import org.protege.editor.owl.ui.clsdescriptioneditor.OWLExpressionChecker;
import org.semanticweb.owl.model.OWLException;

/**
 * @author Luigi Iannone
 * 
 */
public class RegExpVariableEditor extends
		AbstractVariableEditor<RegExpGenerated<?>> {
	private class ChangeTypeActionListener implements ActionListener {
		public ChangeTypeActionListener() {
		}

		public void actionPerformed(ActionEvent e) {
			RegExpVariableEditor.this.handleChange();
		}
	}

	private static final long serialVersionUID = 8899160597858126563L;
	private final OWLEditorKit owlEditorKit;
	private final ConstraintSystem constraintSystem;
	private final Map<JRadioButton, VariableType> jRadioButtonTypeMap = new HashMap<JRadioButton, VariableType>();
	private final Map<VariableType, JRadioButton> typeJRadioButonMap = new HashMap<VariableType, JRadioButton>();
	private final OPPLExpressionChecker<RegExpGenerated<?>> opplFunctionExpressionChecker;
	private final ExpressionEditor<RegExpGenerated<?>> opplFunctionEditor;

	public RegExpVariableEditor(OWLEditorKit owlEditorKit,
			ConstraintSystem constraintSystem) {
		this.setLayout(new BorderLayout());
		this.owlEditorKit = owlEditorKit;
		this.constraintSystem = constraintSystem;
		this.opplFunctionExpressionChecker = new OPPLExpressionChecker<RegExpGenerated<?>>(
				this.getOWLEditorKit()) {
			@Override
			protected RegExpGenerated<?> parse(String text) {
				String variableName;
				try {
					variableName = RegExpVariableEditor.this.variableNameExpressionEditor
							.createObject();
					Object selectedValue = RegExpVariableEditor.this.jRadioButtonTypeMap
							.get(RegExpVariableEditor.this.findSelectedButton());
					if (selectedValue instanceof VariableType) {
						Variable tempVariable = RegExpVariableEditor.this
								.createTempVariable(variableName,
										(VariableType) selectedValue);
						OPPLParser parser = ProtegeParserFactory.getInstance(
								this.getOWLEditorKit()).build(
								this.getListener());
						OPPLSymbolTable symbolTable = parser
								.getSymbolTableFactory().createSymbolTable();
						symbolTable
								.importConstraintSystem(RegExpVariableEditor.this
										.getConstraintSystem());
						RegExpGenerated<?> variableDefinition = (RegExpGenerated<?>) parser
								.parseRegExp(text, tempVariable, symbolTable,
										RegExpVariableEditor.this
												.getConstraintSystem());
						return variableDefinition;
					} else {
						this
								.getListener()
								.reportThrowable(
										new IllegalArgumentException(
												"The variable type cannot be undefined"),
										0, 0, 0);
						return null;
					}
				} catch (OWLException e) {
					this.getListener().reportThrowable(e, 0, 0, 0);
					return null;
				}
			}
		};
		this.variableNameExpressionEditor = new org.protege.editor.owl.ui.clsdescriptioneditor.ExpressionEditor<String>(
				owlEditorKit, new OWLExpressionChecker<String>() {
					private String variableName;

					public void check(String text)
							throws OWLExpressionParserException {
						this.variableName = null;
						if (text.matches("(\\?)?(\\w)+")) {
							this.variableName = text.startsWith("?") ? text
									: "?" + text;
						} else {
							throw new OWLExpressionParserException(
									new InvalidVariableNameException(text));
						}
					}

					public String createObject(String text)
							throws OWLExpressionParserException {
						this.check(text);
						return this.variableName;
					}
				});
		JPanel variableNamePanel = new JPanel(new BorderLayout());
		variableNamePanel.setBorder(ComponentFactory
				.createTitledBorder("Variable name:"));
		this.variableNameExpressionEditor
				.addStatusChangedListener(new org.protege.editor.core.ui.util.InputVerificationStatusChangedListener() {
					public void verifiedStatusChanged(boolean newState) {
						if (newState) {
							RegExpVariableEditor.this.handleChange();
						}
					}
				});
		variableNamePanel.add(this.variableNameExpressionEditor);
		this.add(variableNamePanel, BorderLayout.NORTH);
		this.variableTypeButtonGroup = new ButtonGroup();
		JPanel variableTypePanel = new JPanel(new GridLayout(0, VariableType
				.values().length));
		for (VariableType variableType : VariableType.values()) {
			JRadioButton typeRadioButton = new JRadioButton(variableType.name());
			typeRadioButton.addActionListener(new ChangeTypeActionListener());
			this.variableTypeButtonGroup.add(typeRadioButton);
			variableTypePanel.add(typeRadioButton);
			this.jRadioButtonTypeMap.put(typeRadioButton, variableType);
			this.typeJRadioButonMap.put(variableType, typeRadioButton);
		}
		this.typeJRadioButonMap.get(VariableType.values()[0]).setSelected(true);
		JPanel scopeBorderPanel = new JPanel(new BorderLayout());
		scopeBorderPanel.setBorder(ComponentFactory
				.createTitledBorder("Variable Scope"));
		JPanel variableTypeAndScopePanel = new JPanel(new BorderLayout());
		variableTypeAndScopePanel.add(scopeBorderPanel, BorderLayout.NORTH);
		variableTypeAndScopePanel.add(variableTypePanel, BorderLayout.CENTER);
		variableTypeAndScopePanel.setBorder(ComponentFactory
				.createTitledBorder("Variable Type"));
		this.add(variableTypeAndScopePanel, BorderLayout.CENTER);
		this.opplFunctionEditor = new ExpressionEditor<RegExpGenerated<?>>(
				this.getOWLEditorKit().getOWLModelManager()
						.getOWLOntologyManager(),
				this.opplFunctionExpressionChecker);
		this.opplFunctionEditor
				.addStatusChangedListener(new InputVerificationStatusChangedListener() {
					public void verifiedStatusChanged(boolean newState) {
						RegExpVariableEditor.this.handleChange();
					}
				});
		JPanel opplFunctionEditorPanel = new JPanel(new BorderLayout());
		opplFunctionEditorPanel.setBorder(ComponentFactory
				.createTitledBorder("OPPL Function: "));
		opplFunctionEditorPanel.add(ComponentFactory
				.createScrollPane(this.opplFunctionEditor));
		this.add(opplFunctionEditorPanel, BorderLayout.SOUTH);
	}

	protected void handleChange() {
		if (this.check()) {
			try {
				this.variableNameExpressionEditor.createObject();
				if (this.getVariable() != null) {
					this.constraintSystem.removeVariable(this.getVariable());
				}
				super.setVariable(this.opplFunctionEditor.createObject());
				this.constraintSystem.importVariable(this.getVariable());
				this.notifyListeners();
			} catch (OWLExpressionParserException e) {
				this.notifyListeners();
				throw new RuntimeException(e);
			} catch (OWLException e) {
				this.notifyListeners();
				throw new RuntimeException(e);
			}
		} else {
			this.notifyListeners();
		}
	}

	@Override
	protected boolean check() {
		try {
			this.variableNameExpressionEditor.createObject();
			RegExpGenerated<?> createObject = this.opplFunctionEditor
					.createObject();
			return createObject != null;
		} catch (OWLExpressionParserException e) {
			return false;
		} catch (OWLException e) {
			return false;
		}
	}

	@Override
	public void dispose() {
	}

	private Variable createTempVariable(final String name,
			final VariableType type) {
		return new Variable() {
			public void setVariableScope(VariableScope variableScope,
					VariableScopeChecker variableScopeChecker) {
			}

			public VariableScope getVariableScope() {
				return null;
			}

			public URI getURI() {
				return URI.create(ManchesterVariableSyntax.NAMESPACE
						+ this.getName());
			}

			public VariableType getType() {
				return type;
			}

			public String getName() {
				return name;
			}

			public void accept(PlainVariableVisitor visitor) {
				// TODO Auto-generated method stub
			}

			public <P> P accept(VariableTypeVisitorEx<P> visitor) {
				// TODO Auto-generated method stub
				return null;
			}

			public <P> P accept(VariableVisitor<P> visitor) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/**
	 * @return the owlEditorKit
	 */
	public OWLEditorKit getOWLEditorKit() {
		return this.owlEditorKit;
	}

	/**
	 * @return the constraintSystem
	 */
	public ConstraintSystem getConstraintSystem() {
		return this.constraintSystem;
	}

	@Override
	public String getEditorName() {
		return "Regular Expression Variable";
	}

	@Override
	public void setVariable(RegExpGenerated<?> v) {
		this.clear();
		this.variableNameExpressionEditor.setText(v.getName());
		this.typeJRadioButonMap.get(v.getType()).setSelected(true);
		this.opplFunctionEditor.setText(v.getOPPLFunction());
	}
}