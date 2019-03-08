fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var a= readLine()!!.split(" ").map{it.toLong()}
    var X:Long = a.sum()
    var ans = (10e9).toLong()
    var x = 0L
    (0..n-1).map{i->
        x += a[i]
        if(i<n) ans = minOf(ans,Math.abs(X-2*x))
    }
    println(ans)
}

