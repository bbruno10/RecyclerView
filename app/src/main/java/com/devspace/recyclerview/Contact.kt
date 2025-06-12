package com.devspace.recyclerview

import androidx.annotation.DrawableRes

data class Contact(
    var name: String,
    var phone: String,
    @DrawableRes var icon: Int
)
