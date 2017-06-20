/**
 * Created by Shudipto on 6/17/2017.
 */

fun main(args: Array<String>){

    val bookName = arrayListOf("C","java","c++")

    println("Welcome")
    println("Which book do you want?")
    print("Answer:")
    val book = readLine()

    if (bookName.contains(book)){
        println("We $book book")
        println("What is your occupation?")
        print("Answer:")
        val occupation = readLine()

        when(occupation!!.toLowerCase()){
            "student" -> calVulatePrice(1)

        }

    }

}

fun calVulatePrice(int: Int){}