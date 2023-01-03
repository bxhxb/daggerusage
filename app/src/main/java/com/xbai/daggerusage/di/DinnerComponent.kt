package com.xbai.daggerusage.di

import com.xbai.daggerusage.MainActivity
import com.xbai.daggerusage.vo.Dinner
import dagger.Component
import javax.inject.Scope
import javax.inject.Singleton


@Singleton
@Component(modules = [DinnerModule::class])
interface DinnerComponent {

    @Component.Builder
    interface Builder {
        fun build(): DinnerComponent
    }

    fun dinnerAlterSubComponentBuilder(): DinnerAlterSubComponent.Builder
}