package com.xbai.daggerusage.vo

import com.xbai.daggerusage.vo.Ball
import com.xbai.daggerusage.vo.Member
import javax.inject.Inject

// All dependencies are in own control
class BasketballTeam @Inject constructor() {

    @Inject
    lateinit var member: Member

    @Inject
    lateinit var ball: Ball

    init {
        //println("member name is ${member.name}, member age is ${member.age}")
    }
}