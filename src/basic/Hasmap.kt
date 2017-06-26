package basic

/**
 * Created by Shudipto Trafder on 6/25/2017.
 */

fun main(args: Array<String>) {


    //todo post

    //has map take key and value
    val hasMap = HashMap<String,String>()

    hasMap.put("s","Shudipto")
    hasMap["d"] = "trafder"
    hasMap["f"] = "Himu"
    hasMap["g"] = "Rupa"

    println(hasMap["s"])

    for ((v,k) in hasMap.entries){
        println("$v -> $k")
    }

}