package basic

/**
 * Created by Shudipto Trafder on 6/26/2017.
 */

class Singleton {

    var name: String? = null

    private constructor(){
        println("Instance is created")
    }

    companion object {
        val instacnce: Singleton by lazy { Singleton() }
    }
}

fun main(args: Array<String>) {

    val name = Singleton.instacnce
    name.name = "Shudipto"
    println(name.name)

    val name2 = Singleton.instacnce
    println(name2.name)

    val name3 = Singleton.instacnce
    println(name3.name)

    val name4 = Singleton.instacnce
    println(name4.name)

    val name5 = Singleton.instacnce
    name5.name = "trafder"
    println(name5.name)


}