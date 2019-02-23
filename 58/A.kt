fun main(args: Array<String>) {
    var (a,b,c) = readLine()!!.split(" ").map(String::toInt)
    if((b-a) == (c-b)) println("YES")
    else println("NO")
}
 

