fun main(args: Array<String>) {
    var (N,M) = readLine()!!.split(" ").map(String::toInt)
    
    var A = (1..N).toList().map{i->
        readLine()!!.toString()
    }
    var B = (1..M).toList().map{i->
        readLine()!!.toString()
    }
    var flag = 1
    var ans = 0
    if(M==1){
        (0..N-1).map{i ->
            if(A[i].contains(B[0])) ans=1
        }
    }
    else{
        for(i in 0..N-M){
            for(j in 0..N-M){
                flag = 1
                (0..M-1).map{k->
                    if(A[i+k].substring(j,M) != B[k]) flag = 0
                }
            
                if(flag == 1) ans = 1
            
            }
        }
    }
    if(ans == 1) println("Yes")
    else println("No")
}
