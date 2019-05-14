package encryption

import cc.duduhuo.util.digest.Digest
import java.security.MessageDigest


fun main() {
    val name = "Shudipto"
    val s =Digest.sha1Hex(name,true)
    println(s)
}

fun generateSha1(string: String): String {

    val digest = MessageDigest.getInstance("SHA-1")
    digest.update(string.toByteArray(), 0, string.length)

    val sha1 = digest.digest()
    println(sha1.toString())
    return sha1.toString()
}

fun decrypt(string: String) {
    val digest = MessageDigest.getInstance("SHA-1")
    digest.update(string.toByteArray(), 0, string.length)
    val sha1 = digest.digest()
    println(sha1.toString())
}