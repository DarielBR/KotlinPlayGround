/**
 *Write a function:
 *          fun solution(X: Int, Y: Int, D: Int): Int
 *that, given three integers X, Y and D, returns the minimal number of jumps from position X
 *to a position equal to or greater than Y.
 */
package com.example.myplayground.challenges.codility.lessons

fun frogJump(X: Int, Y: Int, D: Int): Int{

    return (Y-X).floorDiv(D) + if((Y-X).mod(D) != 0) 1 else 0
}