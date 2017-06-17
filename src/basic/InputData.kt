package basic

/**
 * Created by Shudipto on 6/13/2017.
 */

fun main(args: Array<String>){

    //read data from user input
    print("Write your name: ")
    val name = readLine()

    print("Write your age: ")
    val age = readLine()

    println("Name: $name age: $age")

    var status:String ?
    status = "good"
    println(status)
    status = null
    println(message = "Now value is: $status")

    //get int from input
    print("Type a Int number: ")
    val type:Int = readLine()!!.toInt()
    println("your int number is: $type")
}
