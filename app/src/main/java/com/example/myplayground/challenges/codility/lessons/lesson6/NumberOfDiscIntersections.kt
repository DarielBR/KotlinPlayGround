/**
 * Write a function:
 *
 *      fun solution(A: IntArray): Int
 *
 * that, given an array A describing N discs as explained above,
 * returns the number of (unordered) pairs of intersecting discs.
 * The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
 */

package com.example.myplayground.challenges.codility.lessons.lesson6

/* brute force throws an 81% result.
fun numberOfDiscIntersections(A: IntArray): Int{
    var intersections = 0
    var J = 0
    while(J < A.size - 1){
        for (K in J + 1 .. A.size - 1){
            val startJ = J - A[J].toLong()
            val endJ = J + A[J].toLong()
            val startK = K - A[K].toLong()
            val endK = K + A[K].toLong()
            if((startJ <= endK) && (endJ >= startK)) intersections++
            if(intersections > 10000000) return -1
        }
        J++
    }
    return intersections
}
*/

fun numberOfDiscIntersections(A: IntArray): Int{
    if(A.isEmpty()) return 0
    val S = IntArray(A.size){0}
    val E = IntArray(A.size){0}
    val CS = IntArray(A.size){0}
    val CE = IntArray(A.size){0}

    for(i in 0..A.size - 1){
        S[i] = if(i - A[i] <= 0) 0 else i - A[i]
        E[i] = if(i.toLong() + A[i] > A.size - 1) A.size - 1 else i + A[i]
        CS[S[i]]++
        CE[E[i]]++
    }

    val CCS = IntArray(A.size){0}
    val CCE = IntArray(A.size){0}

    CCS[0] = CS[0]
    CCE[0] = CE[0]

    for(i in 1..A.size - 1){
        CCS[i] = CS[i] + CCS[i - 1]
        CCE[i] = CE[i] + CCE[i - 1]
    }

    var intersections = (CCS[0] - CS[0]) * CS[0] + CS[0] * (CS[0] - 1)/2
    for(i in 1..A.size - 1){
        intersections += (CCS[i] - CCE[i - 1] - CS[i]) * CS[i] + CS[i] * (CS[i] - 1)/2
    }
    if (intersections > 10000000) return -1
    return intersections
}