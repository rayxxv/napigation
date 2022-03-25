package com.example.challenge3.direct

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TekananHidrostatis(val massa: Int, val gravitasi: Int, val tinggi: Int) : Parcelable