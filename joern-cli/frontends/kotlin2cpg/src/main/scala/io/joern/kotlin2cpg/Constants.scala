package io.joern.kotlin2cpg

object Constants {
  val alloc                          = "alloc"
  val caseNodeParserTypeName         = "CaseNode"
  val caseNodePrefix                 = "case"
  val codeForLoweredForBlock         = "FOR-BLOCK" // TODO: improve this
  val collectionsIteratorName        = "kotlin.collections.Iterator"
  val companionObjectMemberName      = "object"
  val componentNPrefix               = "component"
  val defaultCaseNode                = "default"
  val empty                          = "<empty>"
  val getIteratorMethodName          = "iterator"
  val hasNextIteratorMethodName      = "hasNext"
  val importKeyword                  = "import"
  val init                           = io.joern.x2cpg.Defines.ConstructorMethodName
  val iteratorPrefix                 = "iterator_"
  val javaUtilIterator               = "java.util.Iterator"
  val lambdaBindingName              = "invoke"    // the underlying _invoke_ fn for Kotlin FunctionX types
  val lambdaName                     = "<lambda>"
  val lambdaTypeDeclName             = "LAMBDA_TYPE_DECL"
  val nextIteratorMethodName         = "next"
  val codePropUndefinedValue         = ""
  val operatorSuffix                 = "<operator>"
  val paramNameLambdaDestructureDecl = "DESTRUCTURE_PARAM"
  val parserTypeName                 = "KOTLIN_PSI_PARSER"
  val retCode                        = "RET"
  val ret                            = "RET"
  val root                           = "<root>"
  val this_                          = "this"
  val tmpLocalPrefix                 = "tmp_"
  val tryCode                        = "try"
  val unknownOperator                = "<operator>.unknown"
  val when                           = "when"
  val wildcardImportName             = "*"
}
