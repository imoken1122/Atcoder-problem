fun main(args: Array<String>) {
    var O = readLine()!!.toString()
    var E = readLine()!!.toString()
    var ans = O.zip(E) { a, b -> "$a$b" }.joinToString("")
    println(ans)
}
 

