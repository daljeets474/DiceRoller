package com.seehrasoftwarediceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImageView:ImageView
    lateinit var rollDice:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImageView=findViewById(R.id.dice_imageview)
        rollDice=findViewById(R.id.rollDice_button)

        rollDice.setOnClickListener {
            rollDice()
        }
    }

    fun rollDice(){
        val random= Random.nextInt(6)+1

        val drawableImage=when(random){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else ->R.drawable.empty_dice
        }

        diceImageView.setImageResource(drawableImage)
    }
}
