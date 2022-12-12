package com.xbai.daggerusage.di

import com.xbai.daggerusage.MainActivity
import dagger.Component


@Component(
    modules = [DinnerModule::class],
    /* use dependencies subjectively or use @SubComponent passively */
    dependencies = [DinnerSubComponent::class]
)
interface DinnerComponent {
    fun inject(activity: MainActivity)
}