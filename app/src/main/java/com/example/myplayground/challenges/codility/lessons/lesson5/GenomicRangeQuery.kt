/**
 * Write a function:
 *
 *      fun solution(S: String, P: IntArray, Q: IntArray): IntArray
 *
 * that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers,
 * returns an array consisting of M integers specifying the consecutive answers to all queries.
 */

package com.example.myplayground.challenges.codility.lessons.lesson5

fun genomicRangeQuery(S: String, P: IntArray, Q: IntArray): IntArray{
    val result =  IntArray(P.size){0}
    val A = IntArray(S.length){0}
    val C = IntArray(S.length){0}
    val G = IntArray(S.length){0}
    val T = IntArray(S.length){0}
    var a = 0
    var c = 0
    var g = 0
    var t = 0

    for (index in S.indices){
        if(S[index] == 'A') a++
        else if(S[index] == 'C') c++
        else if(S[index] == 'G') g++
        else if(S[index] == 'T') t++

        A[index] = a
        C[index] = c
        G[index] = g
        T[index] = t
    }

    for(index in P.indices){
        if(P[index] == Q[index]){
            if (S[P[index]] == 'A') result[index] = 1
            else if (S[P[index]] == 'C') result[index] = 2
            else if (S[P[index]] == 'G') result[index] = 3
            else if (S[P[index]] == 'T') result[index] = 4
        }
        else{
            if (A[P[index]] < A[Q[index]] || S[P[index]] == 'A') result[index] = 1
            else if (C[P[index]] < C[Q[index]] || S[P[index]] == 'C') result[index] = 2
            else if (G[P[index]] < G[Q[index]] || S[P[index]] == 'G') result[index] = 3
            else if (T[P[index]] < T[Q[index]] || S[P[index]] == 'T') result[index] = 4
        }

    }
    return result
}