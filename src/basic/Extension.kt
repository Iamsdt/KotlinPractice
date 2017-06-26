package basic


/**
 * Created by Shudipto Trafder on 6/26/2017.
 */

fun ArrayList<String>.swap(pos1:Int,pos2:Int){

    val temp = this[pos1]

    this[pos1] = this[pos2]
    this[pos2] = temp

}

//extension of class

fun main(args: Array<String>) {

    val list = ArrayList<String>()

    list.add("Shudipto")
    list.add("Trafder")
    list.add("Is")
    list.add("a")
    list.add("good")
    list.add("student")

    println("\nIndex with value")
    for ((position, a) in list.withIndex()) {
        println("Index:$position value:$a")
    }

    list.swap(0, 1)

    println("\nIndex with value after change")
    for ((position, a) in list.withIndex()) {
        println("Index:$position value:$a")
    }

}
