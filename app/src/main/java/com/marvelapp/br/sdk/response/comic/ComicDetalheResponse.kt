package com.marvelapp.br.sdk.response.comic
import com.google.gson.annotations.SerializedName
import com.marvelapp.br.sdk.response.Data
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComicDetalheResponse(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val `data`: Data,
    val etag: String,
    val status: String
)