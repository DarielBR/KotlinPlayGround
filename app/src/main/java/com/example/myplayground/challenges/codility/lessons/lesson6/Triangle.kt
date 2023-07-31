/**
 * Write a function:
 *
 *      fun solution(A: IntArray): Int
 *
 * that, given an array A consisting of N integers,
 * returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 */

package com.example.myplayground.challenges.codility.lessons.lesson6

fun isTriangle(A: Long, B: Long, C: Long): Boolean{
    return  A + B > C &&
            C + A > B &&
            B + C > A
}

fun triangle(A: IntArray): Int{
    val N = A.size
    return if(N < 3) 0
    else if (N == 3) {
        return if(isTriangle(A[0].toLong(),A[1].toLong(),A[2].toLong())) 1 else 0
    }
    else{
        val a = A.sortedArray()
        var result = 0
        var n = N / 2
        var m = n - 1
        var evaluateLeftSide = true

        while(n > 1 || m < N - 2){
            if(evaluateLeftSide){
                if(isTriangle(a[n].toLong(),a[n - 1].toLong(),a[n - 2].toLong())) return 1
            }
            if(isTriangle(a[m].toLong(),a[m + 1].toLong(),a[m + 2].toLong())) return 1
            m++
            n--
            if(n < 2) evaluateLeftSide = false
        }

        return result
    }
}