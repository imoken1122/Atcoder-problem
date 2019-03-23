fun main(args: Array<String>) {
    var s = readLine()!!.toList().map(Char::toString).map(String::toInt)
    println(s.sum())
}

