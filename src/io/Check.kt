package io

import com.google.gson.Gson
import java.io.File

fun main() {
    val file = File("E:\\soil_database.json")
    println(file.exists())
    val gson = Gson()
    val data = gson.fromJson<Model>(file.bufferedReader(), Model::class.java)

    val list = data?.list ?: emptyList()

    var count = 0
    list.forEach {
        if (it.ref.isEmpty()){
            count++
        }
    }

    print("Count: $count")
}