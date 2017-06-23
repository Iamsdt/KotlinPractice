package opp_practice

/**
 * Created by Shudipto Trafder on 6/23/2017.
 */

fun main(args: Array<String>){

    println("Please Enter two number: ")
    print("Number 1: ")
    val num1 = readLine()!!.toDouble()

    print("Number 2: ")
    val num2 = readLine()!!.toDouble()

    val cal = Calculator(num1,num2)

    cal.mul()
    cal.div()

}