package com.sennohananto.intent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class EpParcelable(val massa: Int, val gravitasi: Int, val tinggi: Int) : Parcelable