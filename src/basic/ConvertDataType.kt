package basic

/**
 * Created by Shudipto on 6/13/2017.
 */

fun main(args: Array<String>) {
    //val number1:Int = 10
    val number2:Int?

    val numberStr:String = "12"

    //convert string to value
    number2 = numberStr.toInt()
    println("Number2: $number2")

    val numDouble:Double = 3.1416

    val numInt:Int = numDouble.toInt()

    println("Double value: $numDouble")
    println("Int value: $numInt")
}