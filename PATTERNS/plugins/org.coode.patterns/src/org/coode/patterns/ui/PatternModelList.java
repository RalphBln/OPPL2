package org.coode.patterns.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import org.coode.patterns.InstantiatedPatternModel;
import org.coode.patterns.NonClassPatternExecutor;
import org.coode.patterns.PatternModel;
import org.coode.patterns.protege.PatternAnnotationContainer;
import org.coode.patterns.protege.ProtegeParserFactory;
import org.coode.patterns.ui.utils.JOptionPaneEx;
import org.protege.editor.core.ui.list.MListButton;
import org.protege.editor.core.ui.list.MListItem;
import org.protege.editor.core.ui.list.MListSectionHeader;
import org.protege.editor.core.ui.util.InputVerificationStatusChangedListener;
import org.protege.editor.core.ui.util.VerifyingOptionPane;
import org.protege.editor.owl.OWLEditorKit;
import org.protege.editor.owl.ui.list.AbstractAnnotationsList;
import org.semanticweb.owlapi.model.AddOntologyAnnotation;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiomChange;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyChangeException;
import org.semanticweb.owlapi.model.RemoveOntologyAnnotation;

public class PatternModelList extends
		AbstractAnnotationsList<PatternAnnotationContainer> {
	private final class InstantiateActionListener implements ActionListener {
		private final PatternModel patternModel;

		/**
		 * @param patternModel
		 */
		public InstantiateActionListener(PatternModel patternModel) {
			this.patternModel = patternModel;
		}

		public void actionPerformed(ActionEvent e) {
			PatternModelList.this
					.showInstantiationEditorDialog(this.patternModel);
		}
	}

	/**
	 * @author Luigi Iannone
	 * 
	 */
	public final class PatternListItem extends AnnotationsListItem {
		private final PatternModel patternModel;

		/**
		 * @param annot
		 */
		public PatternListItem(OWLAnnotation annot, PatternModel patternModel) {
			super(annot);
			if (patternModel == null) {
				throw new NullPointerException(
						"The pattern model cannot be null");
			}
			this.patternModel = patternModel;
		}

		/**
		 * @return the patternModel
		 */
		public PatternModel getPatternModel() {
			return this.patternModel;
		}

		@Override
		public void handleEdit() {
			// don't need to check the section as only the direct imports can be
			// added
			PatternModelList.this.getEditor()
					.setEditedObject(this.patternModel);
			int ret = JOptionPaneEx.showValidatingConfirmDialog(
					PatternModelList.this.getOWLEditorKit().getWorkspace(),
					"Pattern Editor", PatternModelList.this.getEditor()
							.getEditorComponent(), PatternModelList.this
							.getEditor(), JOptionPane.PLAIN_MESSAGE,
					JOptionPane.OK_CANCEL_OPTION, PatternModelList.this
							.getComponentPopupMenu());
			if (ret == JOptionPane.OK_OPTION) {
				PatternModel patternModel = PatternModelList.this.getEditor()
						.getEditedObject();
				OWLDataFactory dataFactory = PatternModelList.this
						.getOWLEditorKit().getOWLModelManager()
						.getOWLOntologyManager().getOWLDataFactory();
				OWLLiteral literal = dataFactory.getOWLLiteral(patternModel
						.toString());
				IRI annotationIRI = patternModel.getIRI();
				OWLAnnotation newAnnotation = dataFactory.getOWLAnnotation(
						dataFactory.getOWLAnnotationProperty(annotationIRI),
						literal);
				if (!newAnnotation.equals(this.getAnnotation())) {
					List<OWLOntologyChange> changes = PatternModelList.this
							.getReplaceChanges(this.getAnnotation(),
									newAnnotation);
					PatternModelList.this.getOWLEditorKit().getModelManager()
							.applyChanges(changes);
				}
			}
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6792396788714900301L;
	// Have to as the supe class header is not visible;
	private MListSectionHeader header = new MListSectionHeader() {
		public String getName() {
			return "Patterns";
		}

		public boolean canAdd() {
			return true;
		}
	};
	private final Map<PatternModel, List<MListButton>> buttons = new HashMap<PatternModel, List<MListButton>>();
	private final OWLEditorKit owlEditorKit;
	private final PatternEditor patternEditor;

	/**
	 * @param eKit
	 */
	public PatternModelList(OWLEditorKit eKit) {
		super(eKit);
		// Have to do this as the super class does not expose the OWLEdtorKit
		this.owlEditorKit = eKit;
		this.patternEditor = new PatternEditor(this.getOWLEditorKit(),
				ProtegeParserFactory.getInstance(this.getOWLEditorKit())
						.getPatternFactory());
	}

	@Override
	protected List<OWLOntologyChange> getAddChanges(OWLAnnotation annot) {
		List<OWLOntologyChange> changes = new ArrayList<OWLOntologyChange>();
		changes.add(new AddOntologyAnnotation(this.getRoot().getOntology(),
				annot));
		return changes;
	}

	@Override
	protected List<OWLOntologyChange> getReplaceChanges(
			OWLAnnotation oldAnnotation, OWLAnnotation newAnnotation) {
		List<OWLOntologyChange> changes = new ArrayList<OWLOntologyChange>();
		changes.add(new RemoveOntologyAnnotation(this.getRoot().getOntology(),
				oldAnnotation));
		changes.add(new AddOntologyAnnotation(this.getRoot().getOntology(),
				newAnnotation));
		return changes;
	}

	@Override
	protected List<OWLOntologyChange> getDeleteChanges(OWLAnnotation annot) {
		List<OWLOntologyChange> changes = new ArrayList<OWLOntologyChange>();
		changes.add(new RemoveOntologyAnnotation(this.getRoot().getOntology(),
				annot));
		return changes;
	}

	@Override
	protected Border createListItemBorder(JList l, Object value, int index,
			boolean isSelected, boolean cellHasFocus) {
		Border border = super.createListItemBorder(l, value, index, isSelected,
				cellHasFocus);
		Border toReturn = border;
		if (value instanceof PatternModelList.PatternListItem) {
			PatternModel patternModel = ((PatternListItem) value)
					.getPatternModel();
			PatternBorder patternBorder = new PatternBorder(patternModel);
			toReturn = BorderFactory
					.createCompoundBorder(border, patternBorder);
		}
		return toReturn;
	}

	@Override
	protected void handleOntologyChanges(
			List<? extends OWLOntologyChange> changes) {
		for (OWLOntologyChange change : changes) {
			if (change instanceof AddOntologyAnnotation
					|| change instanceof RemoveOntologyAnnotation) {
				if (change.getOntology().equals(this.getRoot().getOntology())) {
					this.refresh();
					return;
				}
			}
		}
	}

	protected PatternEditor getEditor() {
		return this.patternEditor;
	}

	@Override
	protected void handleAdd() {
		this.getEditor().setEditedObject(null);
		int ret = JOptionPaneEx.showValidatingConfirmDialog(
				PatternModelList.this.getOWLEditorKit().getWorkspace(),
				"Pattern Editor", PatternModelList.this.getEditor()
						.getEditorComponent(), PatternModelList.this
						.getEditor(), JOptionPane.PLAIN_MESSAGE,
				JOptionPane.OK_CANCEL_OPTION, PatternModelList.this
						.getComponentPopupMenu());
		if (ret == JOptionPane.OK_OPTION) {
			PatternModel patternModel = this.getEditor().getEditedObject();
			OWLDataFactory dataFactory = this.getOWLEditorKit()
					.getOWLModelManager().getOWLOntologyManager()
					.getOWLDataFactory();
			OWLLiteral literal = dataFactory.getOWLLiteral(patternModel
					.toString());
			IRI annotationIRI = patternModel.getIRI();
			OWLAnnotation annotation = dataFactory.getOWLAnnotation(dataFactory
					.getOWLAnnotationProperty(annotationIRI), literal);
			this.getOWLEditorKit().getModelManager().applyChanges(
					this.getAddChanges(annotation));
		}
	}

	@Override
	public void setRootObject(PatternAnnotationContainer root) {
		super.setRootObject(root);
		java.util.List<Object> data = new ArrayList<Object>();
		data.add(this.header);
		if (root != null) {
			// @@TODO ordering
			for (OWLAnnotation annot : root.getAnnotations()) {
				data
						.add(new PatternListItem(annot, root
								.getPatternModel(annot)));
			}
		}
		this.setListData(data.toArray());
		this.revalidate();
	}

	@Override
	protected List<MListButton> getListItemButtons(MListItem item) {
		List<MListButton> listItemButtons = super.getListItemButtons(item);
		if (item instanceof PatternListItem) {
			final PatternModel patternModel = ((PatternListItem) item)
					.getPatternModel();
			List<MListButton> list = this.buttons.get(patternModel);
			if (list == null) {
				if (!patternModel.isClassPattern()) {
					ActionListener actionListener = new InstantiateActionListener(
							patternModel);
					InstantiatePatternButton instantiateButton = new InstantiatePatternButton(
							actionListener);
					if (!listItemButtons.contains(instantiateButton)) {
						listItemButtons.add(instantiateButton);
					}
				}
				this.buttons.put(patternModel, listItemButtons);
			} else {
				listItemButtons = list;
			}
		}
		return listItemButtons;
	}

	/**
	 * @return the owlEditorKit
	 */
	public OWLEditorKit getOWLEditorKit() {
		return this.owlEditorKit;
	}

	private void showInstantiationEditorDialog(final PatternModel patternModel) {
		final PatternInstantiationEditor editor = new PatternInstantiationEditor(
				this.getOWLEditorKit(), patternModel.getPatternModelFactory());
		final JComponent editorComponent = editor.getEditorComponent();
		final VerifyingOptionPane optionPane = new VerifyingOptionPane(editor
				.getEditorComponent());
		final InputVerificationStatusChangedListener verificationListener = new InputVerificationStatusChangedListener() {
			public void verifiedStatusChanged(boolean verified) {
				optionPane.setOKEnabled(verified);
			}
		};
		InstantiatedPatternModel instantiatedPatternModel = patternModel
				.getPatternModelFactory().createInstantiatedPatternModel(
						patternModel);
		editor.setInstantiatedPatternModel(instantiatedPatternModel);
		editor.addStatusChangedListener(verificationListener);
		final JDialog dlg = optionPane.createDialog(this.getOWLEditorKit()
				.getWorkspace(), null);
		dlg.setModal(true);
		dlg.setTitle(patternModel.getName());
		dlg.setResizable(true);
		dlg.pack();
		dlg.setLocationRelativeTo(this.getOWLEditorKit().getWorkspace());
		dlg.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
				Object retVal = optionPane.getValue();
				editorComponent.setPreferredSize(editorComponent.getSize());
				if (retVal != null && retVal.equals(JOptionPane.OK_OPTION)) {
					PatternModelList.this.handleInstantiation(editor,
							patternModel);
				}
				editor.removeStatusChangedListener(verificationListener);
				editor.dispose();
			}
		});
		dlg.setVisible(true);
	}

	protected void handleInstantiation(PatternInstantiationEditor editor,
			PatternModel patternModel) {
		NonClassPatternExecutor patternExecutor = new NonClassPatternExecutor(
				editor.getEditedObject(), this.getOWLEditorKit()
						.getModelManager().getActiveOntology(), this
						.getOWLEditorKit().getModelManager()
						.getOWLOntologyManager(), patternModel.getIRI());
		List<OWLAxiomChange> changes = patternModel.accept(patternExecutor);
		for (OWLAxiomChange change : changes) {
			try {
				this.getOWLEditorKit().getModelManager()
						.getOWLOntologyManager().applyChange(change);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}
		}
	}
}