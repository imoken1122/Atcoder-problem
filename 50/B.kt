fun main(args: Array<String>) {
    
    var N = readLine()!!.toInt()
    var time = readLine()!!.split(" ").map{x->x.toInt()}
    var M = readLine()!!.toInt()
    for(i in 1..M){
        var time_ = time.toMutableList()
        var (p,x) = readLine()!!.split(" ").map(String::toInt)
        time_[p-1] = x
        println(time_.sum())
    }
}

