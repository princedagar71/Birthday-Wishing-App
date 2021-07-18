package com.example.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_card.*

class BirthdayCardActivity : AppCompatActivity() {
    companion object{
        const val Name_Extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)
        val name=intent.getStringExtra("BirthdayGreetingText")
        BirthdayGreetingText.text="Happy Birthday $name"
    }
}