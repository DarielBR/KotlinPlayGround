package com.example.myplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myplayground.challenges.codility.lessons.oddOccurrenceInArray3
import com.example.myplayground.challenges.codility.lessons.oddOccurrencesInArray
import com.example.myplayground.challenges.codility.lessons.oddOccurrencesInArray2
import com.example.myplayground.challenges.codility.lessons.practice


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
        val powersOfTwo: MutableList<Int> = mutableListOf()
        var i = 0
        val two = 2
        while(i < 100){
            powersOfTwo.add(Math.pow(2.0,i.toDouble()).toInt())
            powersOfTwo.add(Math.pow(2.0,i.toDouble()).toInt())
            powersOfTwo.add(Math.pow(2.0,i.toDouble()).toInt())
            powersOfTwo.add(Math.pow(2.0,i.toDouble()).toInt())
            i++
        }
        textView.text = oddOccurrenceInArray3(intArrayOf(9,3,9,7,9,7,10,11,10,11,56,45,56,45,87,89,87,89,9,1,3,101,101)).toString()
    }

}