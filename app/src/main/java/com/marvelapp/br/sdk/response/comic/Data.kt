package com.marvelapp.br.sdk.response.comic
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: ArrayList<Result>,
    val total: Int
)