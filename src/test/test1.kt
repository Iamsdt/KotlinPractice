package test

import opp_practice.Calculator

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */

class Person(
        val name: String,
        var isMarried: Boolean
){
    object entry :Calculator() {
        val name = "shudipto"
        val id = 1
        val pass = 2
    }

    companion object{
        val name = "Shudipto"
        val age = "21"
    }
}

fun main(args:Array<String>){
    val person = Person("Shudipto",false)
    println("Person Name: ${person.name}")
    println("Person status: ${person.isMarried}")

    Person.entry.name
    Person.entry.add()


    println(Person.age)
}