package anothercourse

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */

fun main(args: Array<String>){
    print("Input A number: ")
    val a = readLine()!!.toDouble()
    print("Input second number: ")
    val b = readLine()!!.toDouble()

    print("Add:${add(a,b)} sub:${sub(a,b)} Mul:${mul(a,b)} div:${div(a,b)}")
}

fun add(a: Double,b: Double):Double{
    return a + b
}

fun sub(a: Double,b: Double):Double {return a+b}
fun mul(a: Double,b: Double):Double {return a*b}
fun div(a: Double,b: Double):Double {return a/b}