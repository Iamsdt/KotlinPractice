package anothercourse

/**
 * Created by Shudipto Trafder on 6/20/2017.
 */
private class Apple3(){

    var color:String? = null
    var shape:String? = null

    //second constrictor
    constructor(color:String,shape:String): this() {
        //println("Color: $color")
        //println("Shape: $shape")

        this.color = color
        this.shape = shape
    }

    fun GetColor():String?{
        return this.color
    }

    fun GetShape():String?{
        return this.shape
    }

}

fun main(args: Array<String>){
    val apple =Apple3("red","oval")

    println("Color: ${apple.GetColor()} Shape: ${apple.GetShape()}")
}