fun main(args: Array<String>) {
    var (N,x) = readLine()!!.split(" ").map(String::toLong)
    var l = readLine()!!.split(" ").map{x->x.toLong()}
    var a1 = l[0]
    var c :Long = 0L
    if(a1>x){
        var c = a1-x
        a1 = x
    }
    for(i in 1..l.size-1){
        var a2 = l[i]
        if(a1 + a2 >= x){
            c += a1 + a2 - x
            a1 = x-a1
        }
        else a1 = a2
    }
    println(c)
}

