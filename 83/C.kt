fun main(args: Array<String>) {
    var (x,y) = readLine()!!.split(" ").map(String::toLong)
    var cnt = 0
    var ans = x
    while(true){
        ans*=2
        if(ans>y) break
        cnt++
    }
    println(cnt+1)
}

