package com.xbai.daggerusage.di

import com.xbai.daggerusage.MainActivity
import com.xbai.daggerusage.vo.Dinner
import dagger.Component


@Component(
    modules = [DinnerModule::class],
    /* use dependencies subjectively or use @SubComponent passively */
    dependencies = [DetailContentComponent::class]
)
interface DinnerComponent {

    //fun buildDinnerAlterSubComponent(): DinnerAlterSubComponent

    //fun detailContentComponent(detailContentModule: DetailContentModule): DetailContentComponent

    //fun dinner(): Dinner

    fun inject(activity: MainActivity)
}