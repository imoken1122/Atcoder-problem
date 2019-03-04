fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map(String::toInt)
    if(a + b >= 10) println("error")
    else println(a+b)
}

