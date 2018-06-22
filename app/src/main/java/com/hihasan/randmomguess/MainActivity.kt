package com.hihasan.randmomguess

/* Name: Hasan Al Mamun
* My First Kotlin Project
*/
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


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
            val random= Random()
            val selectfood=random.nextInt(FoodList.count())
            txt_food_name.text= FoodList[selectfood]
        }

        btn_add_food.setOnClickListener(){
            val newFood=add_food.text.toString()
            FoodList.add(newFood)
            Toast.makeText(this," You add ${newFood} in the Food List",Toast.LENGTH_SHORT).show()
        }

    }
}

