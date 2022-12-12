package com.xbai.daggerusage.di

import com.xbai.daggerusage.vo.Dinner
import dagger.Component

@Component(modules = [DinnerSubModule::class])
interface DinnerSubComponent {

//    interface Builder {
//        fun build(): DinnerSubComponent
//    }
}