package test

import java.util.*
import kotlin.random.Random

fun main() {

    val old = Date()

    val list = mutableListOf<Int>()

    for (i in 0..25) {
        list.add(i, i)
    }

    println(list[25])

//    val int = Random.nextInt(10, 20)
//    val slice = list.slice(0..int).shuffled(Random(25))
//    val slice2 = list.slice(int + 1..25).shuffled(Random(25))
//
//    val newList = mutableListOf<Int>()
//    newList.addAll(slice2)
//    newList.addAll(slice)

    val int = Random.nextInt(25)

    val newList = list.shuffled(Random(int))

    println("Complete")
    println("Set: ${newList.size}")

    println("Compare")
    println("List: old: $list")
    println("List: New: $newList")

    println("Compare Size")
    println("List: old: ${list.size}")
    println("List: New: ${newList.size}")


    val newDate = Date()
    val data = newDate - old
    println("Time: $data")
}

//[6, 2, 3, 20, 22, 25, 21, 5, 18, 7, 1, 12, 0, 13, 16, 15, 11, 17, 14, 19, 8, 23, 9, 24, 10, 4]
//[6, 24, 1, 22, 5, 23, 14, 21, 9, 0, 15, 20, 25, 19, 11, 13, 12, 8, 18, 10, 7, 17, 4, 16, 3, 2]
//[13, 15, 2, 4, 18, 0, 7, 6, 5, 16, 24, 8, 23, 10, 20, 22, 17, 12, 19, 11, 3, 25, 14, 9, 1, 21]

operator fun Date.minus(date: Date): Long {
    val new = this.time
    val old = date.time
    return new - old
}