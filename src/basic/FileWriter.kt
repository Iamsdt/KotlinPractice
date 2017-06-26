package basic

import java.io.FileReader
import java.io.FileWriter

/**
 * Created by Shudipto Trafder on 6/26/2017.
 */

fun main(args: Array<String>) {
    println("Write a message")
    val str: String = readLine().toString()

    writeToFile(str)

    readFile()

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

fun readFile(){

    try {
        val read = FileReader("text.txt")

        println(read.readText())


    } catch (e:Exception){
        println(e.message)
    }

}
