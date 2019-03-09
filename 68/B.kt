fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var ans = 1
    for(i in 1..N){
        if(ans*2>N) break
        ans*=2
    }
    println(ans)
}

