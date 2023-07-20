package com.example.myplayground.challenges.codility.lessons.lesson4

fun missingInteger(A: IntArray): Int{
    val counters = IntArray(1000000){0}
    for(a in A){
        if(a > 0) counters[a - 1]++
    }
    return counters.indexOfFirst { it == 0 } + 1
}