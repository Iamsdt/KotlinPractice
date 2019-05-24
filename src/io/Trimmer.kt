package io

import com.google.gson.Gson
import java.io.File
import java.io.FileWriter

fun main() {

    val file = File("E:\\soil_database.json")
    println(file.exists())

    val gson = Gson()
    val data = gson.fromJson<Model>(file.bufferedReader(), Model::class.java)

    val list = data?.list ?: emptyList()
    val newList = mutableListOf<MyData>()

    var update = 0
    list.forEach {
        var word = it.word
        word = word.trim()
        if (word[word.length - 1] == '-') {
            println("Word: $word")
            word = word.removeSuffix("-")
            println("Word: $word")
            update++
        }

        val table = it.copy(word = word)
        newList.add(table)
    }

    println(update)

    //save file
    val pojo = Model(1, newList)
    val str = gson.toJson(pojo)
    val writer = FileWriter("soil_database.json")
    writer.write(str)
    writer.close()
    println("Done writing")
}