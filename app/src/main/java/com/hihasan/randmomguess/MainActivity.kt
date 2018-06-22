package com.hihasan.randmomguess

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import java.util.*
import kotlin.math.nextDown


class MainActivity : AppCompatActivity()
{
    //Add Food in Array List
    val FoodList= arrayListOf<String>("Burger","Pizza","Mexican","Chinese")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_decide.setOnClickListener(){
            //println("I am Clicked")
            //Toast.makeText(this,"This is clicked Toast",Toast.LENGTH_SHORT).show()
            val random=random()
            var radomFood=random().nextInt(FoodList.count())
            txt_food_name.text= FoodList[random]
        }

    }
}

