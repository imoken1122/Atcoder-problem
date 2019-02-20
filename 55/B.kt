fun main(args: Array<String>) {
    var N = readLine()!!.toLong()
    var ans = (1..N).reduce({i,j -> 
        i*j%(1000000007L)
    })
    println(ans)
}

