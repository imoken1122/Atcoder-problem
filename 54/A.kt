fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map(String::toInt)
    if(a==1) a = 14
    if (b==1) b = 14
    
    if(a > b) println("Alice")
    else if(a==b) println("Draw")
    else println("Bob")
}

