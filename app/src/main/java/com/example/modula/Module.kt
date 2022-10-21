package com.example.modula

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Module(
  var title: String = "",
  var article: String = "",
  var category: String = "",
  var image: Int = 0
) : Parcelable
