fun main(args: Array<String>) {
    var (a,b,c,d) = readLine()!!.split(" ").map(String::toInt)
    var ans = Math.min(b,d) - Math.max(a,c)
    if(ans>=0) println(ans)
    else println(0)
}
