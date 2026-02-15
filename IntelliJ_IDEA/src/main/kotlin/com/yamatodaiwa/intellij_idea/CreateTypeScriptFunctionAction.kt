package com.yamatodaiwa.intellij_idea

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.fileTypes.FileTypeManager
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory


class CreateTypeScriptFunctionAction : CreateFileFromTemplateAction(
  "TypeScript Entity",
  "Creates a new TypeScript file with some entity",
  FileTypeManager.getInstance().getFileTypeByExtension("ts").icon
) {

  override fun buildDialog(
    project: Project,
    directory: PsiDirectory,
    builder: CreateFileFromTemplateDialog.Builder
  ) {

    val typeScriptIcon = FileTypeManager.getInstance().getFileTypeByExtension("ts").icon

    builder.
        setTitle("TypeScript Entity").
        addKind("Class", typeScriptIcon, "TypeScript Class").
        addKind("Class and namespace", typeScriptIcon, "TypeScript Class and Namespace").
        addKind("Function", typeScriptIcon, "TypeScript Function").
        addKind("Type", typeScriptIcon, "TypeScript Type").
        addKind("Interface", typeScriptIcon, "TypeScript Interface").
        addKind("Enum", typeScriptIcon, "TypeScript Enum")

    }

    override fun getActionName(
      directory: PsiDirectory?,
      newName: String,
      templateName: String?
    ): String =
        "TypeScript Entity"

}
