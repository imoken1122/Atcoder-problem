fun main(args: Array<String>) {
    val n= readLine()!!.toInt()
    val a= readLine()!!.split(" ").map { it.toInt() }

    val ans = when(n%2){
        1    -> (0..n-1).map { (it+1)/2*2 }
        else -> (0..n-1).map { 1+(it)/2*2 }
    }
    
    if (a.sorted()!=ans){
        println(0)
    }else{
        println( (1..n/2).fold(1L){ acc, o-> (acc*2)%1000000007L } )
    }

}


