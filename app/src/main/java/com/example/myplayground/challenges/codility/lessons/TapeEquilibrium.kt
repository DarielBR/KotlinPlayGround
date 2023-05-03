/**
 * Write a function:
 *      fun solution(A: IntArray): Int
 * that, given a non-empty array A of N integers,
 * returns the minimal difference that can be achieved.
 */

package com.example.myplayground.challenges.codility.lessons

import kotlin.math.abs

fun tapeEquilibrium(A: IntArray): Int{
    var minDelta: Int? = null
    var right = A.sum()
    var left = 0
    for(i in 0 .. A.size - 2){
        right -= A[i]
        left += A[i]
        if(minDelta != null){
            if(minDelta > abs(left - right)) minDelta = abs(left - right)
        }else minDelta = abs(left - right)
    }
    return minDelta!!
}