/**
 * Write a function:
 *
 *      fun solution(A: IntArray): Int
 *
 * that, given a non-empty array A consisting of N integers,
 * returns the starting position of the slice with the minimal average.
 * If there is more than one slice with a minimal average,
 * you should return the smallest starting position of such a slice.
 */

package com.example.myplayground.challenges.codility.lessons.lesson5

/**
 * our condition will be the lower average found within any possible slice in A, but...
 * and this is an important "but", as we are looking for the minimal "average",
 * this will always be founded in an slice of 2 or 3 elements for any array.
 * Why is that? I ow you an answer to that question, but after trying for a while a
 * O(N) solution for this problem, it was only possible when this idea was introduced.
 * So every time we find a lesser average we store its initial position in var result,
 * which is at the beginning, out of the array positions. The mechanics in our
 * algorithm will be as follows: starting with position 0 and 1, we will move the final
 * position up one step, and evaluate the condition needed, after that, we'll move the
 * initial position to the right one step, and evaluate again, this is a caterpillar
 * approach and, of course, using prefix sums, we can go over the hole array just once.
 * ☺ꝏꝏꝍ
 */

fun minAvgTwoSlice(A: IntArray): Int{
    if(A.size < 3) return 0
    else {
        var result = -1
        var minAvg = Float.MAX_VALUE //starting with the worst possible value for our case
        var initialPosition = 0
        var finalPosition = 1
        var prefixSum = 0

        var state = 0 //state flag: 0 -> init, 1 -> grow, 2 -> shrink

        while(initialPosition < A.size-2){//just before to reach the last position

            when(state){
                0 -> prefixSum = A[initialPosition] + A[finalPosition]
                1 -> {
                    finalPosition++
                    prefixSum += A[finalPosition]
                    state = 2
                }
                2 -> {
                    initialPosition++
                    finalPosition = initialPosition + 1
                    prefixSum = if(finalPosition < A.size) A[initialPosition] + A[finalPosition] else A[initialPosition]
                    state = 1
                }
            }
            val sliceSize = finalPosition - initialPosition + 1 //"... (notice that the slice contains at least two elements)."
            val currAvg = prefixSum.toFloat() / sliceSize
            if(currAvg < minAvg){
                minAvg = currAvg
                result = initialPosition
            }
            if(state == 0) state = 1
        }
        return result
    }
}