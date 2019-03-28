fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map(String::toInt)
    if(a*b %2==0) println("Even")
    else println("Odd")
}


