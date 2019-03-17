fun main(args: Array<String>) {
    var (N,K)  = (0..1).map{ readLine()!!.toInt()}
    var X = readLine()!!.split(" ").map(String::toInt)
    var sum = 0
    X.map{x->
        
        if(K - x <= x) sum += 2*(K-x)
        else sum += 2*x
    }
    println(sum)
}

