/**
 * Write a function:
 *          fun solution(A: IntArray): Int
 * that, given an array A, returns the value of the missing element.
 */

package com.example.myplayground.challenges.codility.lessons

fun permMissingElem(A: IntArray): Int{
    return ((A.size + 1L) * (A.size + 2L) / 2L - A.sum().toLong()).toInt()
}