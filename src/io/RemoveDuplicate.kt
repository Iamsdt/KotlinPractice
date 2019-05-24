package io

import com.google.gson.Gson
import java.io.File
import java.io.FileWriter

fun main() {
    val file = File("E:\\soil_database.json")
    println(file.exists())

    val gson = Gson()
    val model = gson.fromJson<Model>(file.bufferedReader(), Model::class.java)

    val old = model?.list ?: emptyList()
    val list = old.toMutableList()
    print("Size: ${list.size}")

    for (i in 0 until 2710) {
        val data = list[i]
        var p = i + 1

        while (p < list.size) {
            val table = list[p]
            if (table.word == data.word) {

                if (table.ref == data.ref) {
                    list.removeAt(p)
                    p++
                    continue
                }

                var des1 = data.des.stopSentence()
                var des2 = table.des.stopSentence()

                if (des1 == des2) {
                    list.removeAt(p)
                    p++
                    continue
                }

                des1 = des1 + "\t\tReference: " + data.ref
                des2 = des2 + "\t\tReference: " + table.ref
                val des = des1 + "\n\n" + des2

                val myData = MyData(word = data.word, des = des, ref = "")
                list[i] = myData
                list.removeAt(p)
                println("Remove: ${table.word}\tPos: $p")
            }
            p++
        }
    }

    println("List size: ${list.size}")
    println("List:Pos: 8${list[8].des}")
    println("List:Pos: 8${list[9].des}")

    //save file
    val pojo = Model(1, list)
    val str = gson.toJson(pojo)
    val writer = FileWriter("soil_database.json")
    writer.write(str)
    writer.close()
    println("Done writing")

}

fun String.stopSentence(): String {
    if (this[this.length - 1] != '.') {
        return "$this."
    }
    return this
}