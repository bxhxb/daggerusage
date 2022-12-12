package com.xbai.daggerusage.vo

import javax.inject.Inject

class Ball @Inject constructor() {

    lateinit var brand: String

    lateinit var price: String

    init {
        brand = "Spalding"
        price = "￥200"
    }
}