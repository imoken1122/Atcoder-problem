fun main(args: Array<String>) {
    var (n,a,b) = readLine()!!.split(" ").map(String::toInt)
    if(a * n > b) println(b)
    else println(a*n)
}

