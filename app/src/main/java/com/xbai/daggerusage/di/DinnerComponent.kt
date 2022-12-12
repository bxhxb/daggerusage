package com.xbai.daggerusage.di

import com.xbai.daggerusage.MainActivity
import dagger.Component


@Component(modules = [DinnerModule::class])
interface DinnerComponent {
    fun inject(activity: MainActivity)
}