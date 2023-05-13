package com.example.myplayground.challenges.coderbyte

fun belongsToFibonacci(number: Int): String {
    if (number <= 1) {
        return "yes"
    }

    var Fn_1 = 0
    var Fn_2 = 1
    var Fn: Int

    while (Fn_2 < number) {
        Fn = Fn_1 + Fn_2
        Fn_1 = Fn_2
        Fn_2 = Fn
    }

    return if(Fn_2 == number) "yes" else "no"
}