package com.example.myplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myplayground.challenges.codility.lessons.solution

import com.example.myplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var entries = arrayOf("arrb6???4xxbl5???eee5",
                                "aa6?9",
                                "acc?7??sss?3rr1??????5",
                                "aaaaaaarrrrr??????",
                                "9???1???9???1???9",
                                "9???1???9??1???9",
                                "4?5?4?aamm9",
                                "5??aaaaaaaaaaaaaaaaaaa?5?5",
                                "5??aaaaaaaaaaaaaaaaaaa?5?a??5",
                                "mbbv???????????4??????ddsdsdcc9?")
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textView: TextView = binding.textView
        textView.text = solution(77).toString()
    }

}