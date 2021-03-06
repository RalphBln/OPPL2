 tree grammar ManchesterOWLSyntaxSimplify;

options {
  language = Java;
  tokenVocab = ManchesterOWLSyntax;
  ASTLabelType = ManchesterOWLSyntaxTree;
  filter=true;
  output= AST;
}

@header {
  package org.coode.parsers;
}

bottomup  : 
    conjunction 
    |	disjunction
  
  ;
   
conjunction :
  ^(CONJUNCTION single= .) -> $single
  ;
 
disjunction  :
	^(DISJUNCTION single= .) -> $single 
	; 
 
 
   
