fun main(args: Array<String>) {
    
    var n = readLine()!!.toInt()
    var dict = mutableMapOf<String,Int>()
    (1..n).map{
        var a = readLine()!!
        if(dict[a] == null) dict[a] = 0
        dict[a] = dict[a]!! + 1
    }
    var m = readLine()!!.toInt()
    (1..m).map{
        var b = readLine()!!
        if(dict[b] == null) dict[b] = 0
        dict[b] = dict[b]!! - 1
    } 

    var sort_dict = dict.toList().sortedBy{it.second}
    if(sort_dict[sort_dict.size-1].second<=0) println(0)
    else println(sort_dict[sort_dict.size-1].second)
}