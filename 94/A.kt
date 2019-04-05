fun main(args: Array<String>) {
    var (a,b,x) = readLine()!!.split(" ").map(String::toInt).toMutableList()
    if(a+b>=x && a<=x) println("YES")
    else println("NO")
}