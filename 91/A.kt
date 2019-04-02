fun main(args: Array<String>) {
    
    var (a,b,c) = readLine()!!.split(" ").map(String::toInt)
    if(a+b>=c) println("Yes")
    else println("No")
}