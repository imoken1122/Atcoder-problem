fun main(args: Array<String>) {
    var (r,g,b) = readLine()!!.split(" ")
    var ans = (r+g+b).toInt()
    if(ans%4 == 0) println("YES")
    else println("NO")
}

