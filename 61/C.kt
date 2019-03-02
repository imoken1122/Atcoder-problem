fun main(args: Array<String>) {
    var (N,K) = readLine()!!.split(" ").map(String::toInt)
    var dict:MutableMap<Int,Int> = mutableMapOf()
    (1..N).map{
        var (a,b) = readLine()!!.split(" ").map(String::toInt)
        if(dict[a]==null) dict[a] = 0
        dict[a] = dict[a]!! + b
        }
    var c = 0L
    var sortd_dict = dict.toSortedMap()
    for((k,v) in sortd_dict){
        c += v
        if(c>=K){
            println(k)
            break
        }
    }
}

