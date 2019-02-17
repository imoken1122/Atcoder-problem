fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var arr = Array(1001,{0})
    var ans = 1L
    (2..N).map{i->
        var t = i
        var k = 2
        while(k<=t){
            if(t%k == 0){
                t/=k
                ++arr[k]
                --k
            }
            ++k
        }
    }
    (2..1000).map{i->
        if(arr[i] > 0){
            ans *= (arr[i]+1)
            ans %= (10e9 + 7).toLong()
        }
    }
    println(ans)
    
}

