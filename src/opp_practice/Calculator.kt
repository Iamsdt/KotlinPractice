package opp_practice

/**
 * Created by Shudipto Trafder on 6/23/2017.
 */

open class Calculator(private val a: Double = 0.0,private val b:Double = 0.0){

    fun add(){println("$a + $b = ${a + b}")}

    fun sub(){println("$a - $b = ${a - b}")}

    fun mul(){println("$a * $b = ${a * b}")}

    fun div(){println("$a / $b = ${a / b}")}


}
