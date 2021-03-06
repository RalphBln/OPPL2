tree grammar OPPLTypes;
options {
  language = Java;
  tokenVocab = OPPLScript; 
  ASTLabelType = OPPLSyntaxTree;
  filter=true;
}


@members{
  private  OPPLSymbolTable symtab;
  private  ErrorListener errorListener;
  private ConstraintSystem constraintSystem;
  private OPPLAbstractFactory opplFactory;
  
  public OPPLTypes(TreeNodeStream input, OPPLSymbolTable symtab, ErrorListener errorListener, ConstraintSystem constraintSystem, OPPLAbstractFactory opplFactory) {
    this(input);
    if(symtab==null){
    	throw new NullPointerException("The symbol table cannot be null");
    }
    if(errorListener == null){
    	throw new NullPointerException("The error listener cannot be null");
    }
    if(constraintSystem == null){
      throw new NullPointerException("The constraint system cannot be null");
    }
    if(opplFactory == null){
      throw new NullPointerException("The OPPL Factory cannot be null");
    }
    this.symtab = symtab;
    this.errorListener = errorListener;
    this.opplFactory = opplFactory;
    this.constraintSystem = constraintSystem;
    
  }
  
  public ErrorListener getErrorListener(){
  	return this.errorListener;
  }
  
  public ConstraintSystem getConstraintSystem(){
    return this.constraintSystem;
  }
  
  public OPPLSymbolTable getSymbolTable(){
  	return this.symtab;
  }
  
  public OPPLAbstractFactory getOPPLFactory(){
    return this.opplFactory;
  }
  
  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        getErrorListener().recognitionException(e, tokenNames);
  }
  
  protected void mismatch (IntStream input, int ttype, BitSet follow) throws RecognitionException {
    throw new MismatchedTokenException(ttype,input);
  }
  

  public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException{
    throw e;
  }
  
}

@rulecatch{
  catch(RecognitionException exception){
    if(errorListener!=null){
      errorListener.recognitionException(exception);
    }
  }
  
  catch(RewriteEmptyStreamException exception){
    if(errorListener!=null){
      errorListener.rewriteEmptyStreamException(exception);
    }
  }
}

@header {
  package org.coode.parsers.oppl;
  import java.util.regex.Pattern; 
  import java.util.Collections;
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Collection;
  import org.coode.oppl.VariableScopeChecker;   
  import org.coode.oppl.entity.OWLEntityRenderer;
  import org.coode.oppl.generated.RegexpGeneratedVariable;
  import org.coode.oppl.AbstractConstraint;
  import org.coode.oppl.ConstraintSystem;
  import org.coode.oppl.OPPLQuery;
  import org.coode.oppl.Variable;
  import org.coode.oppl.VariableScope;
  import org.coode.oppl.VariableScopes;
  import org.coode.oppl.exceptions.OPPLException;
  import org.coode.oppl.generated.GeneratedVariable;
  import org.coode.oppl.NAFConstraint;
  import org.coode.oppl.RegExpConstraint;
  import org.coode.oppl.function.Aggregation;
  import org.coode.oppl.function.OPPLFunction;
  import org.coode.oppl.function.Constant;
  import org.coode.oppl.function.Aggregandum;
  import org.coode.oppl.function.ToUpperCaseStringManipulationOPPLFunction;
  import org.coode.oppl.function.ToLowerCaseStringManipulationOPPLFunction;
  import org.coode.oppl.function.Adapter;
  import org.coode.oppl.OPPLAbstractFactory;
  import org.coode.oppl.variabletypes.VariableTypeFactory;
  import org.coode.parsers.Symbol;
  import org.coode.parsers.oppl.variableattribute.CollectionVariableAttributeSymbol;  
  import org.semanticweb.owlapi.model.OWLAxiom;
  import org.semanticweb.owlapi.model.OWLObject;
  import org.semanticweb.owlapi.model.OWLClass;
  import org.semanticweb.owlapi.model.OWLAxiomChange;
  import org.semanticweb.owlapi.model.OWLPropertyExpression;
  import org.semanticweb.owlapi.model.OWLClassExpression;
  import org.semanticweb.owlapi.model.RemoveAxiom;
  import org.semanticweb.owlapi.model.AddAxiom;    
  import org.coode.parsers.ErrorListener;
  import org.coode.parsers.Type;
  import org.coode.parsers.oppl.OPPLSymbolTable;
  import org.coode.parsers.ManchesterOWLSyntaxTree;
  import java.util.Set;
}

// START: root
bottomup // match subexpressions innermost to outermost
    :  
    	opplAxioms
    	| statement
    ;


statement
@init{
	List<Variable<?>> vds = new ArrayList<Variable<?>>();
}
	:
		^(OPPL_STATEMENT vd = variableDefinitions? q=query? actions)
		{
			try{
				if(vd!=null){
					vds.addAll($vd.variables);
				}
				if(!$actions.actions.isEmpty()){
					if(q!=null){
						 // If the query tree is not null but the returned query contains errors (hence it is null) the script should be null.
			    			 $start.setOPPLContent($query.query ==null?null:getOPPLFactory().buildOPPLScript(getConstraintSystem(),
				    					vds, $query.query,
					    				$actions.actions));
					}else{
						$start.setOPPLContent(getOPPLFactory().buildOPPLScript(getConstraintSystem(),vds, null,$actions.actions));
					}
				}
			}catch(IllegalArgumentException e){
				getErrorListener().reportThrowable(e,$start.getLine(),$start.getCharPositionInLine(),$start.getText().length());
			} 
		}
	;

variableDefinitions returns [List<Variable<?>> variables]
@init{
	List<Variable<?>> toReturn = new ArrayList<Variable<?>>();
}
@after{
	$variables = toReturn;
	$start.setOPPLContent($variables);
}
	:
		^(VARIABLE_DEFINITIONS (vd = variableDefinition {toReturn.add(vd.variable);})+)		
	;
	
query returns [OPPLQuery query, OPPLSyntaxTree node]
@init{
		$query = getOPPLFactory().buildNewQuery(getConstraintSystem());
}
@after{
		// No asserted axioms and plains axioms means no query at all.
		if($query.getAssertedAxioms().isEmpty() && $query.getAxioms().isEmpty()){
			$query=null;
		}
		$start.setOPPLContent($query);
		$node = $start;
}
	:
		^(QUERY (selectClause 
		{
		  if($selectClause.axiom!=null){
			   if($selectClause.asserted){
				  $query.addAssertedAxiom($selectClause.axiom);
			   }else{
				  $query.addAxiom($selectClause.axiom);
			   }
			}
		}
		)+ (constraint
				{
				  if($constraint.constraint!=null){
					 $query.addConstraint($constraint.constraint);
					}
				}
		)*)
;

selectClause returns [OWLAxiom axiom, boolean asserted]
	:
		^(ASSERTED_CLAUSE a = .)
		{
			OWLObject object = a.getOWLObject();
			if(object instanceof OWLAxiom){
				$axiom = (OWLAxiom) a.getOWLObject();
			}else{
				getErrorListener().illegalToken(a,"OWL Axiom needed here");
			}			
			
			$asserted= true;
		}
		| ^(PLAIN_CLAUSE a = .)
		{
			OWLObject object = a.getOWLObject();
			if(object instanceof OWLAxiom){
				$axiom = (OWLAxiom) a.getOWLObject();
			}else{
				getErrorListener().illegalToken(a,"OWL Axiom needed here");
			}
			$asserted= false;
		}
	;

actions returns [List<OWLAxiomChange> actions]
@init{
	$actions = new ArrayList<OWLAxiomChange>();
}
@after{
	$start.setOPPLContent($actions);
}
	:
		^(ACTIONS (action 
		{
		  if($action.change!=null){
		    $actions.add($action.change);
		  }
		}
		)+)
	;
	

action returns [OWLAxiomChange change]
	:
		^(ADD a = .){
			OWLObject object = a.getOWLObject();
			if(object instanceof OWLAxiom){
				$change = new AddAxiom(getConstraintSystem().getOntology(), (OWLAxiom)object);
			}else{
				getErrorListener().illegalToken(a,"OWL Axiom needed here");
			}	
		}
		| ^(REMOVE a = .){
			OWLObject object = a.getOWLObject();
			if(object instanceof OWLAxiom){
				$change = new RemoveAxiom(getConstraintSystem().getOntology(), (OWLAxiom)object);
			}else{
				getErrorListener().illegalToken(a,"OWL Axiom needed here");
			}
		}
	;
		
variableDefinition returns [Variable variable]
	:
		^(INPUT_VARIABLE_DEFINITION VARIABLE_NAME VARIABLE_TYPE vs = variableScope?)
		{
			try {
				if((vs!=null && vs.variableScope==null)){
					getErrorListener().illegalToken($start, "Invalid variable scope");
				}else{
					$variable = getConstraintSystem().createVariable($VARIABLE_NAME.getToken().getText(), symtab.getVaribaleType($VARIABLE_TYPE), vs==null?null:vs.variableScope);
				}
			   } catch(OPPLException e){
			      getErrorListener().reportThrowable(e, $INPUT_VARIABLE_DEFINITION.token.getLine(), $INPUT_VARIABLE_DEFINITION.token.getCharPositionInLine(),$INPUT_VARIABLE_DEFINITION.token.getText().length());
		   	}
		}
	  	| ^(GENERATED_VARIABLE_DEFINITION VARIABLE_NAME VARIABLE_TYPE ^( expr = EXPRESSION .*))
	    	{
	    		Type type = getSymbolTable().getExpressionGeneratedVariableType($start,$VARIABLE_TYPE, expr);
	    		if(type!=null){
		       		OWLObject expressionOWLObject = expr.getOWLObject();
		       		if(expressionOWLObject !=null){
					GeneratedVariable<?> v = getConstraintSystem().createExpressionGeneratedVariable($VARIABLE_NAME.getText(), expressionOWLObject);				
					if(v==null){
						getErrorListener().illegalToken($EXPRESSION,"Invalid expression to assign to a variable");
					} 
			        	$variable = v;
			        }else{
			        	getErrorListener().reportThrowable(new NullPointerException("The type of the generated variable is null"), $EXPRESSION.token.getLine(), $EXPRESSION.token.getCharPositionInLine(),$EXPRESSION.token.getText().length());
			        }
			}else{
				getErrorListener().reportThrowable(new NullPointerException("The type of the generated variable is null"), $start.token.getLine(), $start.token.getCharPositionInLine(),$start.token.getText().length());
			}
		}
		| ^(GENERATED_VARIABLE_DEFINITION VARIABLE_NAME VARIABLE_TYPE ^(MATCH se = stringOperation ))
		{
			org.coode.oppl.variabletypes.VariableType<?> type = org.coode.parsers.oppl.VariableType.getVariableType($VARIABLE_TYPE.getText()).getOPPLVariableType();
			RegexpGeneratedVariable<?> v = getConstraintSystem().createRegexpGeneratedVariable($VARIABLE_NAME.getText(),  type, Adapter.buildRegexpPatternAdapter(se));
			$variable = v;
		}
		| ^(GENERATED_VARIABLE_DEFINITION VARIABLE_NAME VARIABLE_TYPE ^(CREATE_OPPL_FUNCTION  value = stringOperation))
		{
			org.coode.oppl.variabletypes.VariableType type = org.coode.parsers.oppl.VariableType.getVariableType($VARIABLE_TYPE.getText()).getOPPLVariableType();
			$variable = constraintSystem.createStringGeneratedVariable($VARIABLE_NAME.getText(),type, value);
		}
		| ^(GENERATED_VARIABLE_DEFINITION name = VARIABLE_NAME VARIABLE_TYPE ^(CREATE_INTERSECTION va = aggregandums))
		{
			Collection<? extends Aggregandum<Collection<? extends OWLClassExpression>>> aggregandumCollection = this.getSymbolTable().getAggregandumCollection(
							VariableTypeFactory.getCLASSVariableType(),
							va.list,va.tokenList,$CREATE_INTERSECTION);
			if(aggregandumCollection!=null){
				$variable = getConstraintSystem().createIntersectionGeneratedVariable(
					$VARIABLE_NAME.getText(),
					VariableTypeFactory.getCLASSVariableType(),
					aggregandumCollection);
			}
		}
		| ^(GENERATED_VARIABLE_DEFINITION name = VARIABLE_NAME VARIABLE_TYPE ^(CREATE_DISJUNCTION va = aggregandums))
		{
			Collection<? extends Aggregandum<Collection<? extends OWLClassExpression>>> aggregandumCollection = this.getSymbolTable().getAggregandumCollection(
							VariableTypeFactory.getCLASSVariableType(),
							va.list,va.tokenList,$CREATE_DISJUNCTION);
			if(aggregandumCollection!=null){
				$variable = getConstraintSystem().createUnionGeneratedVariable(
					$VARIABLE_NAME.getText(),
					VariableTypeFactory.getCLASSVariableType(),
					aggregandumCollection);
			} 
		}    	     	    
	;






stringOperation returns [OPPLFunction<String> value]
@init
  {
    List<Aggregandum<String>> values = new ArrayList<Aggregandum<String>>();
  }
  :
    ^(STRING_OPERATION   (valuesToAggregate= stringExpression {values.add(Adapter.buildSingletonAggregandum(valuesToAggregate));})+)
    {
      $value = Aggregation.buildStringConcatenation(values);
    }
  ;
  




stringExpression returns [OPPLFunction<String> value]
  :
      DBLQUOTE
      {
        $value = new Constant<String>($DBLQUOTE.getText());
      }
    |    ^(IDENTIFIER VARIABLE_NAME DOT GROUPS ^(ATTRIBUTE_SELECTOR INTEGER)) 
    {
      $value = getSymbolTable().defineGroupAttributeReferenceSymbol($VARIABLE_NAME,$INTEGER, getConstraintSystem());
    } 
    | ^(IDENTIFIER  VARIABLE_NAME DOT   RENDERING)
    {
      $value = getSymbolTable().defineRenderingAttributeReferenceSymbol($VARIABLE_NAME,getConstraintSystem());
    }
    |^(TO_LOWER_CASE expression = stringOperation){
	$value = new ToLowerCaseStringManipulationOPPLFunction(expression);
	}
    | ^(TO_UPPER_CASE expression = stringOperation){
	$value = new ToUpperCaseStringManipulationOPPLFunction(expression);
    }
    |^(TO_LOWER_CASE simpleExpression = stringExpression){
	$value = new ToLowerCaseStringManipulationOPPLFunction(simpleExpression);
	}
    | ^(TO_UPPER_CASE simpleExpression = stringExpression){
	$value = new ToUpperCaseStringManipulationOPPLFunction(simpleExpression);
    }
  ;


  
  
  



variableScope returns [Type type, VariableScope variableScope]
@after 
	{ 
		$start.setEvalType($type); 
	} // do after any alternative
	: 
	^(VARIABLE_SCOPE SUBCLASS_OF   classExpression=.)
	{
		try{
			VariableScopeChecker checker = getConstraintSystem().getOPPLFactory().getVariableScopeChecker();
			$type = symtab.getClassVariableScopeType($start, classExpression);
			$variableScope = VariableScopes.buildSubClassVariableScope((OWLClassExpression)classExpression.getOWLObject(),checker);
		}catch(OPPLException e){
			getErrorListener().reportThrowable(e,$start.getLine(),$start.getCharPositionInLine(),$start.getText().length());
		}
	}
	|  ^(VARIABLE_SCOPE SUPER_CLASS_OF  classExpression=.)
	{
		try{
	   		VariableScopeChecker checker = getConstraintSystem().getOPPLFactory().getVariableScopeChecker();     
			$type = symtab.getClassVariableScopeType($start, classExpression);
			$variableScope = VariableScopes.buildSuperClassVariableScope((OWLClassExpression)classExpression.getOWLObject(),checker);
		}catch(OPPLException e){
			getErrorListener().reportThrowable(e,$start.getLine(),$start.getCharPositionInLine(),$start.getText().length());
		}
	}	   
	| ^(VARIABLE_SCOPE SUPER_PROPERTY_OF  propertyExpression=.)
	{
		try{
			VariableScopeChecker checker = getConstraintSystem().getOPPLFactory().getVariableScopeChecker();	   	
			$type = symtab.getPropertyVariableScopeType($start, propertyExpression);
			$variableScope = VariableScopes.buildSuperPropertyVariableScope((OWLPropertyExpression<?,?>) propertyExpression.getOWLObject(),checker);
		}catch(OPPLException e){
			getErrorListener().reportThrowable(e,$start.getLine(),$start.getCharPositionInLine(),$start.getText().length());
		}
	}
	| ^(VARIABLE_SCOPE SUBPROPERTY_OF propertyExpression=.)
	{
		try{
			VariableScopeChecker checker = getConstraintSystem().getOPPLFactory().getVariableScopeChecker();
			$type = symtab.getPropertyVariableScopeType($start, propertyExpression);
			$variableScope = VariableScopes.buildSubPropertyVariableScope((OWLPropertyExpression<?,?>) propertyExpression.getOWLObject(),checker);
		}catch(OPPLException e){
			getErrorListener().reportThrowable(e,$start.getLine(),$start.getCharPositionInLine(),$start.getText().length());
		}
	}     
	| ^(VARIABLE_SCOPE (INSTANCE_OF | TYPES)  individualExpression=.)
	{
		try{
			VariableScopeChecker checker = getConstraintSystem().getOPPLFactory().getVariableScopeChecker();	
			$type = symtab.getIndividualVariableScopeType($start, individualExpression);
			$variableScope = VariableScopes.buildIndividualVariableScope((OWLClassExpression) individualExpression.getOWLObject(),checker);
		}catch(OPPLException e){
			getErrorListener().reportThrowable(e,$start.getLine(),$start.getCharPositionInLine(),$start.getText().length());
		}
	}
	;
	
	

constraint returns [AbstractConstraint constraint]
@init
  {
    List<OPPLSyntaxTree> identifiers = new ArrayList<OPPLSyntaxTree>();
  }
:
		^(INEQUALITY_CONSTRAINT IDENTIFIER ^(EXPRESSION expression=.)){
			$constraint = symtab.getInequalityConstraint($start, $IDENTIFIER,expression, getConstraintSystem());
		}
		| ^(IN_SET_CONSTRAINT v = IDENTIFIER  (i = IDENTIFIER {identifiers.add(i);})+){
			$constraint = symtab.getInSetConstraint($start,v,constraintSystem,identifiers.toArray(new OPPLSyntaxTree[identifiers.size()]));
		}
		| ^(REGEXP_CONSTRAINT IDENTIFIER se = stringOperation)
		{
			Variable variable = symtab.getVariable($IDENTIFIER,getConstraintSystem());
			OPPLFunction<Pattern> adapted = Adapter.buildRegexpPatternAdapter(se);
			$constraint =   new RegExpConstraint(variable, adapted, getConstraintSystem());
		}
		| ^(NAF_CONSTRAINT a = .){
			OWLObject axiom = a.getOWLObject();
			if(axiom instanceof OWLAxiom){
				$constraint =   new NAFConstraint((OWLAxiom) axiom, getConstraintSystem());
			}
			
		}
;



aggregandums returns [List<Aggregandum<?>> list, List<OPPLSyntaxTree> tokenList]
@init
{
	$list = new ArrayList<Aggregandum<?>>();
	$tokenList = new ArrayList<OPPLSyntaxTree>();
}
	:
		(a = aggregandum{
			$tokenList.add(a.node);
			$list.add(a.a);
		})+
	;
	
	
// OPPL can add axiom syntax to the Manchester OWL Syntax
opplAxioms
@init{
	OWLAxiom axiom=null;
}
@after
{
	$start.setOWLObject(axiom);
}
	:
		^(DISJOINT_CLASSES ^(EXPRESSION ^(SET va = aggregandums))){
			axiom = getSymbolTable().getDisjointAxiom($start,va.list,va.tokenList, getConstraintSystem());
		}
		|^(DISJOINT_PROPERTIES ^(EXPRESSION ^(SET va = aggregandums))){
			axiom = getSymbolTable().getDisjointAxiom($start,va.list,va.tokenList, getConstraintSystem());
		}
		| ^(DIFFERENT_INDIVIDUALS ^(EXPRESSION ^(SET va = aggregandums))){
			axiom = getSymbolTable().getDifferentIndividualsAxiom($start,va.list,va.tokenList, getConstraintSystem());		
		}
		| ^(SAME_INDIVIDUAL ^(EXPRESSION ^(SET va = aggregandums))){
			axiom = getSymbolTable().getSameIndividualAxiom($start,va.list,va.tokenList, getConstraintSystem());		
		}
		
	;	

aggregandum returns [Aggregandum<?> a, OPPLSyntaxTree node]
@after
{
	$node = $start;
}
	:
	^(IDENTIFIER  VARIABLE_NAME DOT  VALUES)
    	{
      		$a = Adapter.buildSingletonAggregandum(getSymbolTable().defineValuesAttributeReferenceSymbol($VARIABLE_NAME,getConstraintSystem()));
    	}
    	| IDENTIFIER
    	{
    		Symbol symbol = this.getSymbolTable().resolve($IDENTIFIER);
    		if(symbol!=null){
	    		$a = Adapter.buildAggregandumOfCollection($IDENTIFIER.getOWLObject());
	    	}else{
	    		getErrorListener().unrecognisedSymbol($IDENTIFIER);
	    	}
    	}
	;

