package basic

/**
 * Created by Shudipto Trafder on 6/25/2017.
 */

fun main(args: Array<String>) {

    //kotlin has map
    val hasmap = hashMapOf(1 to "shudipto")
    hasmap.put(2,"trafder")
    hasmap.put(3,"himu")

    println(hasmap[1])

    //print all value with index
    for ((position,value) in hasmap.entries){
        println("Index:$position value:$value")
    }

    //array
    println("\nKotlin Array")
    val array = arrayOf("Shudipto",1,2,3.5,"Trafder")
    array[4] = "himu"
    for ((p,v) in array.withIndex()){
        println("Index:$p value:$v")
    }

    //mutable list
    println("\n\nMutable list of array")
    val list = mutableListOf(1,2,34,5,6,7,8,"Shudipto")

    list[0] = "trafder"
    for ((p,v) in list.withIndex()){
        println("Index:$p value:$v")
    }



}