package com.example.myplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myplayground.challenges.coderbyte.belongsToFibonacci
import com.example.myplayground.challenges.coderbyte.toSnakeCase
import com.example.myplayground.challenges.codility.lessons.frogRiverOne
import com.example.myplayground.challenges.codility.lessons.maxCounters
import com.example.myplayground.challenges.codility.lessons.missingInteger
import com.example.myplayground.challenges.codility.lessons.permCheck
import com.example.myplayground.challenges.codility.tests.simple

import com.example.myplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textView: TextView = binding.textView

        for(count in 1..1000){
            simple(count)
        }

        textView.text = missingInteger(intArrayOf(-1000000,1000000)).toString()
    }

}
