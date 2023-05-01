/**
 * Write a function:
 *           fun solution(A: IntArray, K: Int): IntArray
 * that, given an array A consisting of N integers and an integer K,
 * returns the array A rotated K times.
 */

package com.example.myplayground.challenges.codility.lessons

fun practice(A: IntArray, K: Int): IntArray{
    return if(A.isEmpty()) intArrayOf() else {
        val k: Int = if(K <= A.size) K else K.mod(A.size)
        ((A.drop(A.size - k).toIntArray()) + A).dropLast(k).toIntArray()
    }
}