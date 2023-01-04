package com.xbai.daggerusage.di

import com.xbai.daggerusage.MainActivity
import com.xbai.daggerusage.vo.Dinner
import dagger.BindsInstance
import dagger.Component
import javax.inject.Scope
import javax.inject.Singleton


@Singleton
@Component(modules = [DinnerModule::class])
interface DinnerComponent {

    @Component.Builder
    interface Builder {

        // If do not use @BindsInstance, we need tell dagger how to initialize dinnerModule
        //fun dinnerModule(dinnerModule: DinnerModule): Builder

        // If we use @BindsInstance, we do not need to initialize dinnerModule in the builder. Instead,
        // we can initialize the module data in this builder
        @BindsInstance
        fun dessertType(type: String): Builder

        fun build(): DinnerComponent
    }

    fun dinnerAlterSubComponentBuilder(): DinnerAlterSubComponent.Builder
}