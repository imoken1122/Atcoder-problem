fun main(args: Array<String>) {
    var (N,T) = readLine()!!.split(" ").map(String::toLong)
    var input = readLine()!!.split(" ").map{x->x.toLong()}
    var ans = 0L
    (0..N-2).map{i->
         if(input[(i+1).toInt()]-input[i.toInt()]<T) ans+= input[(i+1).toInt()]-input[i.toInt()]
         else ans += T
    }
    println(ans+T)
        
}

