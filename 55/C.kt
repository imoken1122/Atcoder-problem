fun main(args: Array<String>) {
    var (N,M) = readLine()!!.split(" ").map(String::toLong)
    var cnt = minOf(N, M/2)
    M -= cnt*2
    println(cnt+M/4)
}

