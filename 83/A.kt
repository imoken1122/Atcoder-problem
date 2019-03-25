fun main(args: Array<String>) {
    var (a,b,c,d) = readLine()!!.split(" ").map(String::toInt)
    if(a+b > c+ d) println("Left")
    else if(a+b < c+ d) println("Right")
    else println("Balanced")
}

