package basic

import java.util.*

/**
 * Created by Shudipto on 6/25/2017.
 */

fun main(args: Array<String>) {

    print("Enter your DOB:")
    val DOB = readLine()!!.toInt()

    val year = Calendar.getInstance().get(Calendar.YEAR)
    val age = year-DOB

    println("Your age $age")

}