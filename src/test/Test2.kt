package test

import kotlin.io.*

fun main() {
    println("How many number?")
    val num = readLine()?.trim()?.toInt() ?: 0

    var pos = 0
    var neg = 0

    for (i in 0..num) {
        val input = readLine()?.trim()?.toInt() ?: 0

        if (input >= 0) pos++
        else neg++

    }

    println("Positive: $pos")
    println("Negative: $neg")
}