package basic

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */

//operator rules
/**
 * 1. ()
 * 2. ++ -- (before var)
 * 3. to the power sign
 * 4. *  /
 * 5. + -
 * 6. =
 * 7. ++ -- (after var)
 * */

fun main(args: Array<String>){

    var x:Int = 10
    var y:Int = 20

    val sum = --x + y

    println("Before var $sum")

    val sum2 = x++ + y
    println("After var: $sum2")

}