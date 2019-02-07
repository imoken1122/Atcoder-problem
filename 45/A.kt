fun main(args: Array<String>) {
    var (a,b,c) = (1..3).map{readLine()!!.toFloat()}
    println((0.5 * ((a+b)*c)).toInt())
}

