package com.example.myplayground.challenges.coderbyte

fun toSnakeCase(srt: String): String {
    return "[^\\p{Alpha}+]".toRegex().split(srt).joinToString(separator = "_") { it.lowercase() }
}