fun main(args: Array<String>) {
    var (N,K) = readLine()!!.split(" ").map(String::toInt)
    var A = readLine()!!.split(" ").map(String::toInt)
    var dic :MutableMap<Int,Int> = mutableMapOf()
    A.map{
        if(dic[it] == null) dic[it] = 0
        dic[it] = dic[it]!! + 1
    }
    var s = dic.toList().sortedBy {it.second}.slice(0..dic.size-K-1)
    println(s.map{it.second}.sum())
    
    
    
}

