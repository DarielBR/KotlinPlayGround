package com.example.myplayground.challenges.codility.lessons

fun solution(N: Int): Int{
    val binaryNForm = Integer.toBinaryString(N)
    var maxGap = 0

    var i = 0
    while(i < binaryNForm.length){
        if(binaryNForm[i] == '1'){
            if(binaryNForm.substring(i + 1).indexOfFirst { it == '1' } != -1){
                if(maxGap < binaryNForm.substring(i + 1).substringBefore('1').count{it == '0'}){
                    maxGap = binaryNForm.substring(i + 1).substringBefore('1').count{it == '0'}
                    i = binaryNForm.substring(i + 1).indexOfFirst { it == '1' }
                }
            }
        }
        i++
    }
    return maxGap
}