package com.xbai.daggerusage.di

import com.xbai.daggerusage.MainActivity
import dagger.Subcomponent
import javax.inject.Scope

// Using subcomponent for DinnerComponent

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class SubModuleScope


@Subcomponent(modules = [DinnerAlterSubModule::class])
@SubModuleScope
interface DinnerAlterSubComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): DinnerAlterSubComponent
    }

    fun inject(activity: MainActivity)
}