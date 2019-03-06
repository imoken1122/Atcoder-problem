fun main(args: Array<String>) {
    var (N,M) = readLine()!!.split(" ").map(String::toLong)
    if(Math.abs(N-M)>1){
         println(0)
         return
    }
    var fact1 = 1L
    var fact2 = 1L
    (2..N).map{i->
        fact1 = fact1 * i % 1000000007
    }
    (2..M).map{i->
        fact2 = fact2 * i % 1000000007
    }
    if(N != M) println((fact1*fact2)%1000000007)
    else println((fact1*fact2*2)%1000000007)

}

