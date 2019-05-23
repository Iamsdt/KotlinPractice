package io

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import java.io.File
import java.io.FileWriter

fun main() {
    val file = File("E:\\soil_json.json")
    println(file.exists())

    val gson = Gson()
    val data = gson.fromJson<Model>(file.bufferedReader(), Model::class.java)

    val list = data?.list ?: emptyList()
    val newList = list.toMutableList()

    for (i in 0 until list.size) {
        val m = list[i]
        val word = m.word.trim()
        if (word[word.length - 1] == '-') {
            val str = word.removeSuffix("-").trim()
            val table = m.copy(word = str)
            newList[i] = table
            println(newList[i].word)
        }
        //check is  contain duplicate
        var p = i + 1
        while (p < list.size - 1) {
            val nm = list[p]
            if (nm == m) {
                println("Duplicate found: ${nm.word} *****************")
            }
            p++
        }
    }

    //save file
    val pojo = Model(1, newList)
    val str = gson.toJson(pojo)
    val writer = FileWriter("Soil_ScienceDatabase.json")
    writer.write(str)
    writer.close()
    println("Done writing")

}

data class Model(
        @SerializedName("volume") val volume: Int,
        @SerializedName("collection") val list: List<MyData>
)

data class MyData(
        @SerializedName("word") val word: String,
        @SerializedName("des") val des: String,
        @SerializedName("ref") val ref: String
)