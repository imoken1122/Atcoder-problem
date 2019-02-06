fun main(args: Array<String>) {
    var w = readLine()!!
    val dict:MutableMap<Char,Int> = mutableMapOf()
    var flag = 0
    for(i in 0..w.length-1){
        if(dict[w[i]] == null) dict[w[i]] = 1
        else {
            var j = dict[w[i]]!! + 1
            dict[w[i]] = j
        }
        
        if(dict[w[i]]!! % 2 == 0) flag = 1
        else flag = 0
    }
    if(flag == 1) println("Yes")
    else println("No")
}

