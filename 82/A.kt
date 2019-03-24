fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map(String::toDouble)
    println(Math.round((a+b)/2))
}

