parser grammar OPPLParser;
options {
  output = AST;              // build trees  
  language = Java;
  ASTLabelType = OPPLSyntaxTree; // use custom tree nodes
 }

 
 import MOWLParser;

 tokens{
    ASSERTED_CLAUSE;
    PLAIN_CLAUSE;
    INEQUALITY_CONSTRAINT;
    IN_SET_CONSTRAINT;
    NAF_CONSTRAINT;    
    REGEXP_CONSTRAINT;
    INPUT_VARIABLE_DEFINITION;
    GENERATED_VARIABLE_DEFINITION;
    CREATE_OPPL_FUNCTION;
    VARIABLE_ATTRIBUTE;
    OPPL_FUNCTION;
    ACTIONS;
    VARIABLE_DEFINITIONS;
    QUERY;
    VARIABLE_SCOPE;
    ATTRIBUTE_SELECTOR;
    STRING_OPERATION;
 }
 @members{
   public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException{
    throw e;
  }
  
  protected void mismatch (IntStream input, int ttype, BitSet follow) throws RecognitionException {
    throw new MismatchedTokenException(ttype,input);
  }
 }
 @rulecatch{
 	catch(RecognitionException e){
 		throw e;
 	}
 	catch(RewriteEmptyStreamException e){
   		throw e;
	}
 }
 
 variableDefinitions
  :
    variableDefinition (COMMA variableDefinition)* -> ^(VARIABLE_DEFINITIONS variableDefinition+)
  ;
  
 variableDefinition
  :

      VARIABLE_NAME COLON VARIABLE_TYPE  EQUAL opplFunction -> ^(GENERATED_VARIABLE_DEFINITION VARIABLE_NAME VARIABLE_TYPE ^(opplFunction))      
    | VARIABLE_NAME COLON VARIABLE_TYPE  EQUAL expression -> ^(GENERATED_VARIABLE_DEFINITION VARIABLE_NAME VARIABLE_TYPE ^(EXPRESSION expression))
    | VARIABLE_NAME COLON VARIABLE_TYPE  EQUAL regexp -> ^(GENERATED_VARIABLE_DEFINITION VARIABLE_NAME VARIABLE_TYPE regexp)
    | VARIABLE_NAME COLON VARIABLE_TYPE (variableScope)? -> ^(INPUT_VARIABLE_DEFINITION VARIABLE_NAME VARIABLE_TYPE variableScope?)    
  ;
  


variableScope
  :
    OPEN_SQUARE_BRACKET (variableScopeSpecification = SUBCLASS_OF | variableScopeSpecification = SUBPROPERTY_OF | variableScopeSpecification = SUPER_CLASS_OF |  variableScopeSpecification =SUPER_PROPERTY_OF |  variableScopeSpecification = INSTANCE_OF | variableScopeSpecification = TYPES) expression CLOSED_SQUARE_BRACKET -> ^(VARIABLE_SCOPE $variableScopeSpecification ^(EXPRESSION expression))
  ; 

regexp
	:
		MATCH OPEN_PARENTHESYS stringOperation CLOSED_PARENTHESYS -> ^(MATCH stringOperation)
	;

 query
  :
    SELECT selectClause (COMMA selectClause)* (WHERE constraint (COMMA constraint)*)? -> ^(QUERY selectClause+ constraint*)
  ;
 
 selectClause
  :
      ASSERTED axiom -> ^(ASSERTED_CLAUSE axiom)
    | axiom -> ^(PLAIN_CLAUSE axiom)
  ;

axiom	    	options {backtrack=true;}:
		binaryAxiom -> ^(binaryAxiom)
		| nAryAxiom -> ^(nAryAxiom)
		| unaryAxiom -> ^(unaryAxiom)
		| assertionAxiom -> ^(assertionAxiom)
		| hasKeyAxiom ->^(hasKeyAxiom)
		| annotationAssertionAxiom ->^(annotationAssertionAxiom)
	;		



nAryAxiom
	:
		DISJOINT_CLASSES opplFunction -> ^(DISJOINT_CLASSES opplFunction)
		| DISJOINT_PROPERTIES opplFunction -> ^(DISJOINT_PROPERTIES opplFunction)
		| SAME_INDIVIDUAL opplFunction -> ^(SAME_INDIVIDUAL opplFunction)
		| DIFFERENT_INDIVIDUALS opplFunction -> ^(DIFFERENT_INDIVIDUALS opplFunction)
	;
 
 
 constraint
  :
       first = VARIABLE_NAME NOT_EQUAL second = expression -> ^(INEQUALITY_CONSTRAINT IDENTIFIER[$first] ^(EXPRESSION $second))
    |  VARIABLE_NAME IN OPEN_CURLY_BRACES atomic (COMMA atomic)* CLOSED_CURLY_BRACES  -> ^(IN_SET_CONSTRAINT IDENTIFIER[$VARIABLE_NAME] atomic+)
    |  VARIABLE_NAME MATCH OPEN_PARENTHESYS stringOperation CLOSED_PARENTHESYS -> ^(REGEXP_CONSTRAINT IDENTIFIER[$VARIABLE_NAME] stringOperation)
    | FAIL axiom -> ^(NAF_CONSTRAINT axiom)
  ; 
 
 actions
  :
    BEGIN action (COMMA action)* END -> ^(ACTIONS action+)
  ;
 
 action	
  : 
      ADD axiom -> ^(ADD axiom)
  |   REMOVE axiom -> ^(REMOVE axiom)
  ;
 

 
 
opplFunction
  :
      CREATE OPEN_PARENTHESYS stringOperation CLOSED_PARENTHESYS -> ^(CREATE_OPPL_FUNCTION stringOperation)
    | CREATE_INTERSECTION  OPEN_PARENTHESYS atomic (COMMA atomic)*  CLOSED_PARENTHESYS -> ^(CREATE_INTERSECTION atomic+)
    | CREATE_DISJUNCTION OPEN_PARENTHESYS atomic CLOSED_PARENTHESYS -> ^(CREATE_DISJUNCTION atomic)
    | SET OPEN_PARENTHESYS atomic (COMMA atomic)* CLOSED_PARENTHESYS -> ^(EXPRESSION ^(SET atomic*))
  ;

stringOperation
  :
    stringExpression (PLUS stringExpression)* -> ^(STRING_OPERATION  stringExpression+)

  ;
  
stringExpression
	:
		
		simpleStringExpression (lowerUpperCase^)*
		| OPEN_PARENTHESYS! stringOperation CLOSED_PARENTHESYS! (lowerUpperCase^)+

	;





	
lowerUpperCase
	:
		DOT TO_LOWER_CASE ->^(TO_LOWER_CASE)
		| DOT  TO_UPPER_CASE ->^(TO_UPPER_CASE)
	;	

simpleStringExpression
	:
		DBLQUOTE -> ^(DBLQUOTE)
	    	| variableAttributeReference -> ^(variableAttributeReference)
	;

atomic	:
		IDENTIFIER 
		| ENTITY_REFERENCE -> ^(ENTITY_REFERENCE)
		| VARIABLE_NAME -> ^(IDENTIFIER[$VARIABLE_NAME])     
	   	| createIdentifier -> ^(createIdentifier)
		| variableAttributeReference -> ^(variableAttributeReference)	
	;

iri
	:
	IRI -> IRI
	| VARIABLE_NAME DOT IRI_ATTRIBUTE_NAME -> ^(IRI[$VARIABLE_NAME.getText()+ $DOT.getText()+ $IRI_ATTRIBUTE_NAME.getText()]VARIABLE_NAME)
	;

createIdentifier 
  :
   ESCLAMATION_MARK IDENTIFIER  -> ^(IDENTIFIER[$ESCLAMATION_MARK.getText()+ $IDENTIFIER.getText()])  
  ;

variableAttributeReference
  :
    VARIABLE_NAME DOT (a = VALUES | a = RENDERING)   ->^(IDENTIFIER[$VARIABLE_NAME.getText()+$DOT.getText() + $a.getText()] VARIABLE_NAME DOT $a)
    | VARIABLE_NAME DOT GROUPS attributeSelector  ->^(IDENTIFIER[$VARIABLE_NAME.getText()+$DOT.getText() + $GROUPS.getText()+$attributeSelector.selectorText]  VARIABLE_NAME DOT GROUPS attributeSelector)        
  ;


  
attributeSelector returns [String selectorText]
  :
    OPEN_PARENTHESYS i = INTEGER CLOSED_PARENTHESYS
    {
      $selectorText = $OPEN_PARENTHESYS.getText() + $i.getText() + $CLOSED_PARENTHESYS.getText();
    } 
    ->  ^(ATTRIBUTE_SELECTOR INTEGER)
    
  ;
  
