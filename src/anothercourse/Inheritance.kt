package anothercourse

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */

open class Math {

    fun add(a:Int, b:Int):Int{
        return a+b
    }

    fun sub(a:Int, b:Int):Int{
        return a-b
    }
}

class Math2 : Math(){

    fun mul(a:Int, b:Int):Int{
        return a*b
    }

    fun div(a:Int, b:Int):Int{return a/b}
}



fun main(args: Array<String>){

//    val math = Math()
//    println("add: ${math.add(20,21)}")
//    println("add: ${math.sub(22,21)}")

    val math2 = Math2()
    println("add: ${math2.add(20,21)}")
    println("sub: ${math2.sub(22,21)}")

    println("mul: ${math2.mul(20,21)}")
    println("div: ${math2.div(22,21)}")

}