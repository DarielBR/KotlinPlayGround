package com.example.myplayground.challenges.codility.lessons

fun maxCounters(N: Int, A: IntArray): IntArray{
    val counters = IntArray(N){0}
    var maxCounter = 0
    var lastRise = 0

    for (a in A) {
        if (a <= N) {
            counters[a - 1] = maxOf(counters[a - 1], lastRise)
            counters[a - 1]++
            maxCounter = maxOf(maxCounter, counters[a - 1])
        } else lastRise = maxCounter
    }
    for (i in counters.indices) {
        counters[i] = maxOf(counters[i], lastRise)
    }
    return counters
}