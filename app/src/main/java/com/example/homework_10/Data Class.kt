package com.example.homework_10

import android.media.Image
import androidx.annotation.DrawableRes

data class Category (
    var text: String,
    var textColor: Int,
    var background: Int
)


data class Product (
    var categoryType: String,
    var image: Int,
    var description: String,
    var price: String,
)
