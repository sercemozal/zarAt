package com.sercem.zar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zar1ImageView :ImageView = findViewById(R.id.zar1ImageView)
        val zar2ImageView :ImageView = findViewById(R.id.zar2ImageView)
        val zarAtBtn : Button = findViewById(R.id.zarAtBtn)
        val temizleBtn : Button = findViewById(R.id.temizleBtn)

        zar1ImageView.setImageResource(R.drawable.empty_dice)
        zar2ImageView.setImageResource(R.drawable.empty_dice)

        zarAtBtn.setOnClickListener {

            Toast.makeText(this@MainActivity, "Zar Atıldı!", Toast.LENGTH_SHORT).show()

            val randomSayi1 = (1..6).random()
            val randomSayi2 = (1..6).random()

            when (randomSayi1)
            {
                1-> zar1ImageView.setImageResource(R.drawable.dice_1)
                2-> zar1ImageView.setImageResource(R.drawable.dice_2)
                3-> zar1ImageView.setImageResource(R.drawable.dice_3)
                4-> zar1ImageView.setImageResource(R.drawable.dice_4)
                5-> zar1ImageView.setImageResource(R.drawable.dice_5)
                else -> zar1ImageView.setImageResource(R.drawable.dice_6)
            }
            when (randomSayi2)
            {
                1-> zar2ImageView.setImageResource(R.drawable.dice_1)
                2-> zar2ImageView.setImageResource(R.drawable.dice_2)
                3-> zar2ImageView.setImageResource(R.drawable.dice_3)
                4-> zar2ImageView.setImageResource(R.drawable.dice_4)
                5-> zar2ImageView.setImageResource(R.drawable.dice_5)
                else -> zar2ImageView.setImageResource(R.drawable.dice_6)
            }

        }
        temizleBtn.setOnClickListener {
            zar1ImageView.setImageResource(R.drawable.empty_dice)
            zar2ImageView.setImageResource(R.drawable.empty_dice)


        }
    }

}