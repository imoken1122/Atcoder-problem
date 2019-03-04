fun main(args: Array<String>) {
    var s = readLine()!!.toList()
    if(s.size == s.toSet().size) println("yes")
    else println("no")
}

