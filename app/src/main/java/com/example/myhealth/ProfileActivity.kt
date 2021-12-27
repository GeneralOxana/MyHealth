package com.example.myhealth

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import android.widget.EditText

class ProfileActivity : AppCompatActivity() {

    //var weight = 0
    //var pref: SharedPreferences? = null

    override fun onCreate(w: Bundle?) {
        super.onCreate(w)
        setContentView(R.layout.activity_profile)

       // pref = getSharedPreferences("PROFILE", Context.MODE_PRIVATE)
        //weight = pref?.getInt(weight)

    }



    /*fun onClickAddWeight() {
        tvWeight = findViewById<>(R.id.tv_weight)
        tv_weight.text = weight.toString()
    }*/

    /*fun saveData(res: Int) {
        val editor = pref?.edit()
        editor?.putInt("weight", res)
        editor?.applay()

    }*/

   // fun OnDestroy() {
       // super.onDestroy()
       // saveData(weight)
   // }
}


