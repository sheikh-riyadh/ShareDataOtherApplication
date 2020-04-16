package com.example.sharedataotherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sharedataotherapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        btnId.setOnClickListener {
            var userText: String = editTxtId.text.toString() // Get data from editText
            var intent = Intent()
            Intent.ACTION_SEND // Intent take a action, our action is SEND ACTION
            intent.putExtra(Intent.EXTRA_TEXT, userText) // Put data
            intent.type ="txt/plain"

            startActivity(Intent.createChooser(intent,"Choose")) // Target destination
        }
    }
}
