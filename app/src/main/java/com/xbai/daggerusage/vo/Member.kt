package com.xbai.daggerusage.vo

import javax.inject.Inject

class Member @Inject constructor() {
    lateinit var name: String
    lateinit var age: String

    init {
        name = "Dazhai"
        age = "26"
    }
}