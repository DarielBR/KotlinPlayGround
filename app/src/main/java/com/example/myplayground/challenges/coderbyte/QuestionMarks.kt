package com.example.myplayground.challenges.coderbyte

fun QuestionsMarks(str: String): String {
    var validPairs = 0
    var conditionsMeet = 0
    var result = "false"
    var aOperand: Int
    var bOperand: String

    var i = 0
    while(i < str.length - 1){
        if(str[i].digitToIntOrNull() != null){
            aOperand = str[i].digitToInt()
            bOperand = (10 - aOperand).toString()
            if(str.substring(i + 1).indexOfFirst{it == bOperand[0]} != -1){
                validPairs++
                if(str.substring(i + 1).substringBefore(bOperand).count{it == '?'} == 3){
                    conditionsMeet++
                }
                i += str.substring(i + 1).indexOfFirst{it == bOperand[0]}
            }
        }
        i++
    }
    if(validPairs > 0 && validPairs == conditionsMeet) result = "true"
    return result;

}