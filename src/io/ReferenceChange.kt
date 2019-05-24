package io

import com.google.gson.Gson
import java.io.File
import java.io.FileWriter

fun main() {
    val file = File("E:\\Soil_ScienceDatabase.json")
    println(file.exists())

    val gson = Gson()
    val data = gson.fromJson<Model>(file.bufferedReader(), Model::class.java)

    val newList = data?.list ?: emptyList()
    val list = newList.toMutableList()

    println("List Size: ${list.size}")

    for (i in 0 until list.size) {
        val t = list[i]
        val ref = check(t.ref)
        val table = t.copy(ref = ref)
        list[i] = table
    }

    println("List Size: ${list.size}")
    //save file
    val pojo = Model(1, list)
    val str = gson.toJson(pojo)
    val writer = FileWriter("soil_database.json")
    writer.write(str)
    writer.close()
    println("Done writing")
}

fun check(string: String): String {
    val ref1 = "Glossary of Terms in Soil Science"
    val auth1 = "Canada Department Of Agriculture. (1978). "

    val ref2 = "Glossary Of Soil Science Terms"
    val auth2 = "Science Society of America. (2008). "

    val ref3 = "Glossary Of Terms In Soil Science"
    val auth3 = "Canada Department Of Agriculture. (1978). "

    val ref4 = "The Nature and Properties of Soils"
    val auth4 = "Weil, Raymond & C Brady, Nyle. (2016). "

    val ref5 = "Introduction to Environmental Soil Physics"
    val auth5 = "Hillel, D. (2003). "

    val ref6 = "GLOSSARY OF TERMS FOR SUBAQUEOUS SOILS, LANDSCAPES, LANDFORMS, AND PARENT MATERIALS OF ESTUARIES AND LAGOONS"
    val auth6 = "Christi, Corpus. (2019). "

    val ref7 = "No reference found"

    return when (string) {
        ref1 -> "$auth1$ref1."
        ref2 -> "$auth2$ref2."
        ref3 -> "$auth3$ref3."
        ref4 -> "$auth4$ref4."
        ref5 -> "$auth5$ref5."
        ref6 -> "$auth6$ref6."
        ref7 -> "$ref7."
        else -> "$ref7."
    }

}