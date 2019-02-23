fun main(args: Array<String>) {
    var (N,M) = readLine()!!.split(" ").map(String::toInt)
    
    var user = (1..N).map{i->
        var (a,b) = readLine()!!.split(" ").map(String::toLong)
        Pair(a,b)
    }.toMutableList()
     var point = (1..M).map{i->
        var (a,b) = readLine()!!.split(" ").map(String::toLong)
        Pair(a,b)
    }.toMutableList()
    
    for(u in user){
        var dist = point.map{p->
            Math.abs(u.first-p.first)+ Math.abs(u.second - p.second)
        }.toList()
        println(dist.indexOf(dist.min()!!)+1)
    }
}

