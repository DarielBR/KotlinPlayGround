package com.example.myplayground.challenges.codility.tests

fun missingSmallestInteger(A: IntArray): Int {
    val counters = IntArray(A.size){0}

    for(a in A){
        if(a > 0) counters[a - 1]++
    }

    val smallestMissing = counters.indexOfFirst { it == 0 }

    return  if(smallestMissing > -1) smallestMissing + 1
            else A.size + 1
}