fun main(args: Array<String>) {
    var A = readLine()!!.split(" ").map{it.toInt()}
    var ans = A.sorted()
    println(ans[0] + ans[1])
}

