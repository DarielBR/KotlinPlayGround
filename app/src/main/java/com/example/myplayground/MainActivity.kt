package com.example.myplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myplayground.challenges.codility.lessons.lesson5.countDiv
import com.example.myplayground.challenges.codility.lessons.lesson5.genomicRangeQuery
import com.example.myplayground.challenges.codility.lessons.lesson5.minAvgTwoSlice
import com.example.myplayground.challenges.codility.lessons.lesson6.maxProductOfThree
import com.example.myplayground.challenges.codility.tests.missingSmallestInteger
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

        //textView.text = missingSmallestInteger(intArrayOf(-1,-3)).toString()
        //textView.text = countDiv(0,0,11).toString()
        //textView.text = genomicRangeQuery("CAGCCTA", intArrayOf(2,5,0), intArrayOf(4,5,6)).contentToString()
        //textView.text = minAvgTwoSlice(intArrayOf(4,2,2,5,1,5,8)).toString()
        //textView.text = minAvgTwoSlice(intArrayOf(10,10,-1,2,4,-1,2,-1)).toString()
        //textView.text = maxProductOfThree(intArrayOf(-3,1,2,-2,5,6)).toString()
        textView.text = maxProductOfThree(intArrayOf(-5,5,-5,4)).toString()
    }

}
