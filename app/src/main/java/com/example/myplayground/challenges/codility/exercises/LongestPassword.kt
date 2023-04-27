package com.example.myplayground.challenges.codility

fun solution(S: String): Int{
    if(S.isNotBlank()){
        val modS = S.plus(" ")
        var longestPassword = ""
        var bufferPassword = ""
        var letters = 0
        var numbers = 0
        var validCandidate = true
        val space = " "

        var i = 0
        while(i < modS.length){

            if(modS[i] == space[0]){
                if(validCandidate
                    && letters.mod(2) == 0
                    && numbers.mod(2) !=0
                    && longestPassword.length <= bufferPassword.length){
                    longestPassword = bufferPassword
                }
                bufferPassword = ""
                letters = 0
                numbers = 0
                validCandidate = true
                i++
            }else{
                if(modS[i].isLetterOrDigit()){
                    bufferPassword = bufferPassword.plus(modS[i])
                    if(modS[i].isDigit()) numbers++ else letters++
                }else validCandidate = false
                i++
            }
        }
        return if(longestPassword.isNotBlank()) longestPassword.length else -1
    }
    else return -1
}