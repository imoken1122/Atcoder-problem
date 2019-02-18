fun main(args: Array<String>) {
    var s = readLine()!!.toString()
    var ans = s.toList().dropWhile{
        it!='A'
    }.reversed().dropWhile{
        it!='Z'
    }.size
    println(ans)
}

