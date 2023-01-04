package com.xbai.daggerusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xbai.daggerusage.GlobalString.Companion.APP_TAG
import com.xbai.daggerusage.di.DaggerDinnerComponent
import com.xbai.daggerusage.di.DinnerModule
//import com.xbai.daggerusage.di.DaggerBasketballTeamComponent
import com.xbai.daggerusage.vo.BasketballTeam
import com.xbai.daggerusage.vo.Dinner
import javax.inject.Inject

// In this di-subcomponent branch, I tested the injection with subcomponent mode.
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var basketallTeam: BasketballTeam

    @Inject
    lateinit var dinner: Dinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerDinnerComponent.builder().dessertType("Dark").build()
            .dinnerAlterSubComponentBuilder().build().inject(this)

        println("${APP_TAG}: dinner staple food is ${dinner.stapleFood.food}, dessert is ${dinner.dessert.dessertType}")

        println("${APP_TAG}: team member name is ${basketallTeam.member.name}, age is ${basketallTeam.member.age}")
    }
}