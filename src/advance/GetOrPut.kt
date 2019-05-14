package advance

import kotlinx.coroutines.*

var state = true

fun main() {

    GlobalScope.launch {
        println("Launching")
        val success = callNetwork()
        println("Sleeping")
        delay(500)
        success.cancel()
        println("Changing state")
        if (success.isActive){
            success.await()
        }else{
            println("job cancel")
        }
        state = true
        println(state)
    }

    println("Program complete")

    //keep jvm alive
    Thread.sleep(3000)
}

suspend fun saveDb(): Boolean {
    delay(1000)
    return true
}

fun callNetwork() = GlobalScope.async {
    println("Network call")
    delay(1000)
    println("Response found")
    if (state) {
        println("Processing database")
        val st = saveDb()
        println(st)
    } else {
        println("No data found; Exception")
        throw Exception("No Data found")
    }
}