package com.example.happybirthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
    }

        fun createdBirthdayCard(view: View) {
            val name = nameInput.editableText.toString()
            val intent = Intent(  this, BirthdayGreetingActivity::class.java )
           intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
}