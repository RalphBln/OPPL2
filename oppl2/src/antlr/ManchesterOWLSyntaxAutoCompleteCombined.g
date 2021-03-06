grammar ManchesterOWLSyntaxAutoCompleteCombined;

options {
  output = AST;              // build trees
  ASTLabelType = ManchesterOWLSyntaxTree; // use custom tree nodes
  language = Java;
  tokenVocab = ManchesterOWLSyntaxAutoCompleteCombined;
}
import   MOWLLexer,  ManchesterOWLSyntaxAutoCompleteBase;  

@header {
  package org.coode.parsers;
}

@members {

  private  ErrorListener errorListener;
  
      public ManchesterOWLSyntaxAutoCompleteCombinedParser(TokenStream input, ErrorListener errorListener) {
        this(input, new RecognizerSharedState(),errorListener);
      }
      public ManchesterOWLSyntaxAutoCompleteCombinedParser(TokenStream input, RecognizerSharedState state, ErrorListener errorListener) {
        this(input, state);
        if(errorListener==null){
           throw new NullPointerException("The error listener cannot be null");
        }
          this.errorListener = errorListener;  
      }
  
 
  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
  	if(getErrorListener()!=null){
        getErrorListener().recognitionException(e, tokenNames);
    }
  }
  public ErrorListener getErrorListener(){
  	return this.errorListener;
  }
  
  protected void mismatch (IntStream input, int ttype, BitSet follow) throws RecognitionException {
    throw new MismatchedTokenException(ttype,input);
  }
  

  public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException{
    throw e;
  }
}

@rulecatch{
  catch(RecognitionException e){
    if(errorListener!=null){
      errorListener.recognitionException(e);
    }
  }
  
  catch(RewriteEmptyStreamException e){
    if(errorListener!=null){
      errorListener.rewriteEmptyStreamException(e);
    }
  }
}

  
main: 
(       options {backtrack=true;}:       

  axiom  -> axiom
  | incompleteAxiom  -> incompleteAxiom
  | incompleteExpression  -> incompleteExpression  
    |   standaloneExpression -> standaloneExpression

 ) 
; 
 