fun main(args: Array<String>) {
    var (a,b,x) = readLine()!!.split(" ").map(String::toLong)
    
    if(a % x == 0L) println(b/x-a/x + 1)
    else println(b/x-a/x)
    
}

