package com.xbai.daggerusage.di

import com.xbai.daggerusage.vo.Dessert
import com.xbai.daggerusage.vo.Dinner
import com.xbai.daggerusage.vo.StapleFood
import dagger.Module
import dagger.Provides

@Module
class DinnerModule {

    @Provides
    fun provideDessert(): Dessert = Dessert()

    @Provides
    fun provideStapleFood(): StapleFood = StapleFood()

    @Provides
    fun provideDinner(dessert: Dessert, stapleFood: StapleFood): Dinner = Dinner(dessert, stapleFood)
}