fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map(String::toInt)
    var ans = a + b
    if(ans>=24) println(ans-24)
    else println(ans)
}

