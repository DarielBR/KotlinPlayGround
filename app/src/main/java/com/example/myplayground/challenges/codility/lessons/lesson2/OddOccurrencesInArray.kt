/**
*Write a function:
*
*       class Solution { public int solution(int[] A); }
*
*that, given an array A consisting of N integers fulfilling the above conditions,
*returns the value of the unpaired element.
*/

package com.example.myplayground.challenges.codility.lessons.lesson2

fun oddOccurrenceInArray3(A: IntArray): Int{
    var result = 0
    for (a in A) result = result xor a
    return result
}
