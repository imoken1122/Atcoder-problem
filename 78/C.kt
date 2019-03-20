fun main(args: Array<String>) {
    var (N,M) = readLine()!!.split(" ").map(String::toInt)
    println((Math.pow(2.0,M.toDouble())*(1900*M+100*(N-M))).toInt())
    
}

