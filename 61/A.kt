fun main(args: Array<String>) {
    var (a,b,c) = readLine()!!.split(" ").map(String::toInt)
    if(a<=c && c<=b) println("Yes")
    else println("No")
}

