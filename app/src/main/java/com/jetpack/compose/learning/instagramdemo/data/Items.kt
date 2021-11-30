package com.jetpack.compose.learning.instagramdemo.data

data class Items(
    val id: Int,
    val profilePic: Int,
    val title: String,
    val subTitle: String,
    val image: Int = 0
)
