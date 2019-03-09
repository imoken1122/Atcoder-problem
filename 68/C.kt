fun main(args: Array<String>) {
    var (N,M) = readLine()!!.split(" ").map(String::toInt)
    var pair:MutableList<Pair<Int,Int>> = mutableListOf()
    (1..M).map{i->
        var (a,b) = readLine()!!.split(" ").map(String::toInt)
        pair.add(Pair(a,b))
    }
    for(p in pair){
        if(p.second == N && pair.contains(Pair(1,p.first))){
            println("POSSIBLE")
            return
        }
    }
    
    println("INPOSSIBLE")
}

