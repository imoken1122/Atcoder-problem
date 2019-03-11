fun lcm(n1: Long, n2: Long): Long {
    var temp: Long
    var m = n1
    var n = n2
    while (m % n != 0L) {
        temp = n
        n = m % n
        m = temp
    }
    return n1 / n * n2
}
fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var a = readLine()!!.toLong()
    (2..N).map{
        var b = readLine()!!.toLong()
        a = lcm(a,b)
    }
    println(a)
}
