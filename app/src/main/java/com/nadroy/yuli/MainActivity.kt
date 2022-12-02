package com.nadroy.yuli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ingresar(btningresar: View){
        val ingreso = Intent(this,RegistrarseActivity2::class.java)
        startActivity(ingreso)
    }
}