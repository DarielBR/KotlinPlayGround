/**
 * Write a function:
 *      fun solution(A: IntArray): Int
 * that, given a non-empty array A consisting of N integers, returns the maximum depth of water.
 */

package com.example.myplayground.challenges.codility.exercises

fun solution(A: IntArray): Int{
    var maxDepth = 0
    var posStartDown: Int? = null
    var downFlag = false
    var poolDepth: Int
    var poolLowValue: Int? = null

    if(A.size > 2){
        var i = 1
        while (i < A.size) {
            if (A[i] < A[i - 1]) {//downward
                if(!downFlag){
                    posStartDown = i-1
                    downFlag = true
                    poolLowValue = A[i]
                }
                if(poolLowValue!! > A[i]) poolLowValue = A[i]
            }else if(A[i] > A[i-1]){//upward
                if(downFlag){
                    if(A[i] >= A[posStartDown!!]){
                        poolDepth = A[posStartDown]-poolLowValue!!
                        downFlag = false
                    }else poolDepth = A[i] - poolLowValue!!
                    if(poolDepth > maxDepth) maxDepth = poolDepth
                }
            }
            i++
        }
    }
    return maxDepth
}