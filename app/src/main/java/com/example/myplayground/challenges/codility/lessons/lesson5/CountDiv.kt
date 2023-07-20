/**
 * Write a function
 *
 *      fun solution(A: Int, B: Int, K: Int): Int
 *
 * that, given three integers A, B and K, returns the number of integers within
 * the range [A B] that are divisible by K, i.e.:
 *
 *              { i : A ≤ i ≤ B, i mod K = 0 }
 */

package com.example.myplayground.challenges.codility.lessons.lesson5

fun countDiv(A: Int, B: Int, K: Int): Int{
    if (A == B){
        if(B.mod(K)==0) return 1
        else return 0
    }
    else {
        if(A==0) return B / K + 1
        else return B / K - (A - 1) / K
    }
}