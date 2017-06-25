package basic

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */

fun main(args: Array<String>) {

    val list = ArrayList<String>()

    list.add("Shudipto")
    list.add("Trafder")
    list.add("Is")
    list.add("a")
    list.add("good")
    list.add("student")

    println("First Name:${list[0]}") //list.get(0)

    println("All element")
    println("\nOnly value")
    for (a in list){
        println("value:$a")
    }

    println("\nIndex with value")
    for ((position,a) in list.withIndex()){
        println("Index:$position value:$a")
    }

    println("\n\nUpdate an element")
    //list.set(5,"developer")
    list[5] = "developer"

    println("All element")
    println("\nOnly value")
    for (a in list){
        println("value:$a")
    }

    println("\nIndex with value")
    for ((position,a) in list.withIndex()){
        println("Index:$position value:$a")
    }

    println("\n\nSearch in array list")
    if (list.contains("Shudipto")){
        println("Name found")
    } else println("Not found")

}