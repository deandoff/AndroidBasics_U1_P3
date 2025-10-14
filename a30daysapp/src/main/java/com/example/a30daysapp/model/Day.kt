package com.example.a30daysapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day (
    @StringRes val title: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)