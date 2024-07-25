package com.lab.experience

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lab.experience.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.nextPage.setOnClickListener {
            val moveToCompose = Intent(this@MainActivity,ActivityTwo::class.java)
            moveToCompose.putExtra("data","testing")
            startActivity(moveToCompose)
        }
    }
}