package anothercourse

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */

fun main(args: Array<String>) {

    var range = 1..10

    println("For loop start")
    for (numbers in range) {
        println(numbers)
    }

    var num = 1

    println("\n\nwhile loop start")
    while (num <= 10) {
        println(num)
        num++
    }


    var num2 = 1

    println("\n\ndo while loop start")
    do {
        println(num2)
        num2++
    }while (num2 <= 10)
}