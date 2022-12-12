package com.xbai.daggerusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.xbai.daggerusage.di.DaggerBasketballTeamComponent
import com.xbai.daggerusage.di.DaggerDinnerComponent
import com.xbai.daggerusage.vo.BasketballTeam
import com.xbai.daggerusage.vo.Dinner
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var basketallTeam: BasketballTeam

    @Inject
    lateinit var dinner: Dinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerBasketballTeamComponent.builder().build().inject(this)

        DaggerDinnerComponent.builder().build().inject(this)

        println("team member name is ${basketallTeam.member.name}, age is ${basketallTeam.member.age}")

        println("dinner staple food is ${dinner.stapleFood.food}, dessert is ${dinner.dessert.dessertType}")
    }
}