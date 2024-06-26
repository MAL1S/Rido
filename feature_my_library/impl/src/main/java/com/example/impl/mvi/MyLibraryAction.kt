package com.example.impl.mvi

import android.net.Uri
import com.example.core.mvi.api.Action

sealed interface MyLibraryAction : Action

data class SaveFilesAction(
    val uris: List<Uri>
) : MyLibraryAction

data object OpenFilePickerAction : MyLibraryAction
data object CloseFilePickerAction : MyLibraryAction
