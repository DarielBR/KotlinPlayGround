/**
 * Write a function:
 *      fun solution(A: IntArray): Int
 * that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
 */

package com.example.myplayground.challenges.codility.lessons

fun permCheck(A: IntArray): Int{
    val counters = IntArray(A.size)
    for(i in A.indices){
        if (A[i] <= A.size) counters[A[i] - 1]++
        if((i == A.size-1) && (counters.all { it == 1 })) return 1
    }
    return 0
}