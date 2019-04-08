fun main(args: Array<String>) {
    var (a,b,c,d) = readLine()!!.split(" ").map(String::toInt)
    if(Math.abs(b-a)<=d && Math.abs(c-b)<=d || Math.abs(c-a)<=d) println("Yes")
    else println("No")
}
