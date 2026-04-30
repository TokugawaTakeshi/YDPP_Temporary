package com.yamatodaiwa.intellij_idea

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.fileTypes.FileTypeManager
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory


class CreatingOfTypeScriptFileForBusinessRuleAction : CreateFileFromTemplateAction(
  "Business Rules",
  "Creates a file with a business rule in TypeScript implementation",
  FileTypeManager.getInstance().getFileTypeByExtension("ts").icon
) {

  override fun buildDialog(
    project: Project,
    directory: PsiDirectory,
    builder: CreateFileFromTemplateDialog.Builder
  ) {

    val typeScriptIcon = FileTypeManager.getInstance().getFileTypeByExtension("ts").icon

    builder.
        setTitle("Business Rule").
        addKind("Entity", typeScriptIcon, "BusinessRuleEntity.ts").
        addKind("Gateway", typeScriptIcon, "BusinessRuleGateway.ts")

    }

    override fun getActionName(
      directory: PsiDirectory?,
      newName: String,
      templateName: String?
    ): String =
        "Business Rule"

}
