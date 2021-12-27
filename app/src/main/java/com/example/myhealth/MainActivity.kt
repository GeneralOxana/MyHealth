package com.example.myhealth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.myhealth.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(q: Bundle?) {
        super.onCreate(q)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun goProfile(view: android.view.View) {val Intent = Intent(this, ProfileActivity::class.java)
        startActivity(Intent) }
    fun goRec(view: android.view.View) {val Intent = Intent(this, RecActivity::class.java)
        startActivity(Intent) }
    fun goFood(view: android.view.View) {val Intent = Intent(this, FoodActivity::class.java)
        startActivity(Intent) }
    fun goBad(view: android.view.View) {val Intent = Intent(this, BadActivity::class.java)
        startActivity(Intent) }
    fun goExit(view: android.view.View) {super.onDestroy()}

}