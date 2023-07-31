/**.
 * Write a function:
 *      fun solution(A: IntArray): Int
 * that, given a non-empty array A, returns the value of the maximal product of any triplet.
 */

package com.example.myplayground.challenges.codility.lessons.lesson6

import kotlin.math.max

fun maxProductOfThree(A: IntArray): Int{
    val sortedA = A.sorted().toIntArray()
    val n = sortedA.size
    val leftEnd = sortedA[0] * sortedA[1] * sortedA[n - 1]
    val rightEnd = sortedA[n - 3] * sortedA[n - 2] * sortedA[n - 1]
    return maxOf(leftEnd, rightEnd)
}