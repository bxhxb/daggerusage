package com.xbai.daggerusage.di

import com.xbai.daggerusage.vo.Dessert
import com.xbai.daggerusage.vo.Dinner
import com.xbai.daggerusage.vo.Fruit
import com.xbai.daggerusage.vo.StapleFood
import dagger.Module
import dagger.Provides

@Module
class DinnerModule {
    @Provides
    fun provideDessert(): Dessert = Dessert("chocolate ice cream")

    @Provides
    fun provideStapleFood(): StapleFood = StapleFood("rice")
}