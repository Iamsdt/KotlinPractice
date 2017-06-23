package test

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */

class Person(
        val name: String,
        var isMarried: Boolean
)

fun main(args:Array<String>){
    val person = Person("Shudipto",false)
    println("Person Name: ${person.name}")
    println("Person status: ${person.isMarried}")
}