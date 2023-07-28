/**
 * Write a function
 *      fun solution(A: IntArray): Int
 * that, given an array A consisting of N integers, returns the number of distinct values in array A.
 */

package com.example.myplayground.challenges.codility.lessons.lesson6

fun distinct(A: IntArray): Int{
    return if(A.isEmpty()) 0
    else {
        var result = 1
        A.sort()
        for (index in 0..A.size - 2) {
            if (A[index] != A[index + 1]) result++
        }
        return result
    }
}