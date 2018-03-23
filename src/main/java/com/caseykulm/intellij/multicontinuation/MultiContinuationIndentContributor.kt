package com.caseykulm.intellij.multicontinuation

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PsiJavaPatterns
import com.intellij.psi.PsiIdentifier

class MultiContinuationIndentContributor : CompletionContributor() {
  init {
    extend(
        CompletionType.BASIC,
        PsiJavaPatterns.psiElement(PsiIdentifier::class.java),
        MultiContinuationIndentProvider())
  }
}