fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var x = readLine()!!.split(" ").map(String::toLong)
    var dic :MutableMap<Long,Long> = mutableMapOf()
    var cnt = 0L
    x.map{
            if(dic[it] == null) dic[it] = 0
            dic[it] = dic[it]!! + 1
            }
    dic.toList().sortedBy{it.first}.reversed().map{
        var (k,v) = it
        if(k>v) cnt += v
        else cnt += v-k
    }
    println(cnt)
}

