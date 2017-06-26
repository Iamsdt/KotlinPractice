package basic

import java.io.FileWriter

/**
 * Created by Shudipto Trafder on 6/26/2017.
 */

fun main(args: Array<String>) {
    println("Write a message")
    val str: String = readLine().toString()

    writeToFile(str)

}

fun writeToFile(str: String) {

    val writer = FileWriter("text.txt", true)

    try {
        writer.write(str+"\n")

    } catch (ex: Exception) {
        println(ex.message)

    } finally {
        writer.close()
    }
}
