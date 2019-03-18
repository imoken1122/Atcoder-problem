fun main(args: Array<String>) {
    var (n,k) = (0..1).map{readLine()!!.toInt()}
    var ans = 1
    (1..n).map{
        if(ans*2>=ans+k) ans += k
        else ans *= 2
    }
    println(ans)
}

