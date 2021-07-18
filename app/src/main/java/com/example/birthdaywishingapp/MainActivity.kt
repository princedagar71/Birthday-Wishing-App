package com.example.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BCCButton.setOnClickListener{
            val name=FillNamePlainTextView.editableText.toString()
            Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()
            val intent=Intent(this,BirthdayCardActivity::class.java)
            intent.putExtra(BirthdayCardActivity.Name_Extra,name)
            startActivity(  intent)
        }
    }
}