package com.example.myhealth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myhealth.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var bindingClass :ActivityProfileBinding
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


