package basic

/**
 * Created by Shudipto Trafder on 6/25/2017.
 */

fun main(args: Array<String>) {

    //we want to finish main loop when
    // value of a is 3

    loop@ for (a in 1..5){
        if (a == 2){
            continue
        }
        println("value a:$a")

        for (b in 1..4){
            if (a == 3){
                break@loop
            }

            println(" b:$b")
        }
    }

    println("Loop done")
}