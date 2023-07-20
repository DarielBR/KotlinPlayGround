/**
 *Write a function:
 *       fun solution(X: Int, A: IntArray): Int
 *that, given a non-empty array A consisting of N integers and integer X,
 *returns the earliest time when the frog can jump to the other side of the river.
 */

package com.example.myplayground.challenges.codility.lessons.lesson4

fun frogRiverOne(X: Int, A: IntArray): Int{
    val counters = IntArray(X)//array of counters leaves falling into positions from 1 to 5
    for(i in A.indices){
        counters[A[i] - 1]++
        if((i >= X - 1) && (counters.all{ it > 0})) return i
    }
    return -1
}