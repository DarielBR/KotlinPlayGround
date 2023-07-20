package com.example.myplayground.challenges.codility.lessons.lesson5

fun passingCars(A: IntArray): Int {
    var goingEast = 0 // count of zeros (cars traveling east)
    var crossingEastWest = 0 // count of passing car pairs

    for (i in A.indices) {
        if (A[i] == 0) {
            goingEast++ // increment the count of zeros
        } else {
            crossingEastWest += goingEast // add the count of zeros to the count of pairs
        }

        if (crossingEastWest > 1_000_000_000) {
            return -1 // check if the count of pairs exceeds the limit
        }
    }

    return crossingEastWest
}