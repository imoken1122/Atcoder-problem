fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map(String::toInt)
    if(a <= b) println(a)
    else println(a-1)
}
