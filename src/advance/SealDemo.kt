package advance

sealed class Response

data class Success(val res: String) : Response()
data class Error(val code: Int, val res: String) : Response()

fun getUrlPage(url: String): Response {
    val valid = false // Some logic here!
    return if (valid) Success("Content")
    else Error(404, "Not found")
}

fun main(args: Array<String>) {
    val response = getUrlPage("")

    when (response) {
        is Success -> {
        }
        is Error -> {
        }
    }
}
