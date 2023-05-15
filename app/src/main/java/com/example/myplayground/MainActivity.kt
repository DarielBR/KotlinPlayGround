package com.example.myplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myplayground.challenges.coderbyte.belongsToFibonacci
import com.example.myplayground.challenges.coderbyte.toSnakeCase
import com.example.myplayground.challenges.codility.lessons.frogRiverOne
import com.example.myplayground.challenges.codility.lessons.maxCounters
import com.example.myplayground.challenges.codility.lessons.permCheck

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
        textView.text = maxCounters(5,intArrayOf(3,4,4,6,1,4,4)).toList().toString()
    }

}