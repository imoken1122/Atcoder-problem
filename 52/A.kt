n(args: Array<String>) {
    var (a,b,c,d) = readLine()!!.split(" ").map(String::toInt)
    if(a*b > c*d) println(a*b)
    else println(c*d)
}

