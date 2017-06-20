package anothercourse

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */

fun main(args: Array<String>) {

    val arrays = Array(5) { 0 }

    arrays[1] = 1
    arrays[2] = 2
    println(arrays[2])

    val arrayStr = Array(5) { "Shudipto" }
    arrays[1] = 2
    println(arrayStr[0])

    val arraysNew = listOf(1, "shudipto", 2.5, 0.234, "Trafder", false)

    var size = 0

    //using while loop
    while (size < arraysNew.size) {
        println("Position $size value ${arraysNew[size]}")
        size++

    }

    // using for loop
    for (i in arraysNew) {
        println("value: $i")
    }

    for ((position, i) in arraysNew.withIndex()) {
        println("position: $position value: $i")
    }

    println("Please help us to fill some data")
    val arrayFill = Array(5) { 0 }
    for ((position) in arrayFill.withIndex()) {
        print("Insert a value:")
        val input = readLine()!!.toInt()
        arrayFill[position] = input
    }

    println("Your inserted data")
    for ((position, i) in arrayFill.withIndex()) {
        println("position: $position value: $i")
    }
}