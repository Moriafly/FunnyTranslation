package com.funny.translation.translate.bean

import androidx.annotation.Keep

@Keep
@kotlinx.serialization.Serializable
data class OpenSourceLibraryInfo(
    val author: String,
    val description: String,
    val name: String,
    val url: String
)