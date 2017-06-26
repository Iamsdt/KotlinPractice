package basic

/**
 * Created by Shudipto Trafder on 6/25/2017.
 */

fun main(args: Array<String>) {

    //TODO post

    //set can not save duplicate value
    val set = setOf(15,2,3,10,5,6,15,10)

    for ((p,v) in set.withIndex()) println("Index:$p value:$v")

    val mSet = mutableSetOf(1,2,4,5,6,6,8,1)
    mSet.add(5)
    println("\n\n")
    for ((p,v) in mSet.withIndex()) println("Index:$p value:$v")

}
