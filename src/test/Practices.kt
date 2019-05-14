package test

fun main() {
    update(1, ::printData)
}

fun printData(){
    println("Hey I here")
}

fun update(int: Int, operator: () -> Unit) {
    //do something
    for (i in 0..int){
        operator()
    }
}