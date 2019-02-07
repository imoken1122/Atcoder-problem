
fun main(args: Array<String>) {
    var S = readLine()!!.toString()
    var ans = S.toLong()
    
    for(i in 1..Math.pow(2.0,(S.length-1).toDouble()).toInt()-1){
        var str = ""
        var plus:MutableList<String> = mutableListOf()
        var j = i
        var t = ""
        for(s in S){
            str += s
            if(j%2 != 0) str += '+'
            j /= 2
        }
        
        for(k in str){
            if(k == '+'){ 
                plus.add(t)  
                t = ""
            }
            else t += k
        }
        plus.add(t)
        
        ans += plus.map{x->x.toLong()}.sum()
    }
    println(ans)
}

