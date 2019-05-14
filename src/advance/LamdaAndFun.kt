package advance

fun main() {

    val multiply = { i: Int ->
        i * 2
    }

    println(multiply(2))

    val div: (Int) -> Int = {
        it / 2
    }

    println(div(2))

    //anonymous function
    num1(2){
    }   //do something

    num1(1, ::println)
}

fun num1(number: Int, operator: (Int) -> Unit) {
    operator(number)
}