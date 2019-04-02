fun main(args: Array<String>) {
    
    var n = readLine()!!.toInt()
    var aka = (1..n).map{
        var (a,b) = readLine()!!.split(" ").map(String::toInt)
        Pair(a,b)
    }.sortedBy{it.first}
   var ao = (1..n).map{
        var (a,b) = readLine()!!.split(" ").map(String::toInt)
        Pair(a,b)
    }.sortedBy{it.first}

    var collect = mutableListOf<Pair<Int,Int>>()
    ao.map{blue->
        var leave = aka.filter{
                    var (a,b) = it
                    var (c,d) = blue
                    if(a<c && b<d && !collect.contains(it)) true
                    else false
                    }
        if(leave.size != 0){
            collect.add(leave.sortedBy{it.second}[leave.size-1])
        }
    }
    println(collect.size)
}