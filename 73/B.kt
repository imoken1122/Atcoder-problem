fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var c=0
    (1..n).map{
        var (a,b) = readLine()!!.split(" ").map(String::toInt)
        c += b - a + 1
    }
    println(c)
}

