package advance

fun main(args: Array<String>) {
    val u = User("")

    val bools = u isSame "Shudipto"

    val bools2 = u isDefferent "Shudipto"

    val us = User()

    val di = us.isDefferent("Shudipto")

    val d = us isDefferent "Shudipto"

    print(di)
    print(d)
    print(bools)


    //replace char
    "Shudipto" change 's'
}

infix fun String.change(s: Char) = this[0]

class User(val name: String = "",
           val age: Int = 0,
           val year: Int = 1) {

    infix fun isSame(st: String) = name == st

    infix fun isDefferent(string: String) = name != string
}