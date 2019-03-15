fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var dict:MutableMap<Long,Int> = mutableMapOf()
    (1..n).map{
        var a = readLine()!!.toLong()
        if(dict[a] == null) dict[a] = 0
        dict[a] = dict[a]!! + 1
    }
    println(dict.values.filter{y-> y%2 == 1}.size)
     
}

