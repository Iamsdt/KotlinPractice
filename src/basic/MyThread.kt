package basic

/**
 * Created by Shudipto Trafder on 7/3/2017.
 */

class MyThread:Thread{

    var threadName:String? = null

    constructor(threadName:String):super(){
        this.threadName = threadName
    }

    override fun run() {

        var coutn = 0

        while (coutn < 10){
            println("Thread name:$threadName Count: $coutn")
            coutn++
            Thread.sleep(1000)
        }
    }
}



fun main(args: Array<String>) {

    val thread = MyThread("Thread 1")
    thread.start()

    println("Thread 1 start")

    val thread2 = MyThread("Thread 2")
    thread2.start()

    println("Thread 2 start")

    val thread3 = MyThread("Thread 3")
    thread3.start()

    println("Thread 3 start")

    val thread4 = MyThread("Thread 4")
    thread4.start()
    thread4.join()

    println("Thread 4 start")

}