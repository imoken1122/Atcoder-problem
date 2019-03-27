fun main(args: Array<String>) {

    var (N,Y) = readLine()!!.split(" ").map(String::toInt)
    for(x in 0..N){
        for(y in 0.. N){
            var z = Y - 10000*x - 5000*y
            if(z>=0 && x+y+(z/1000).toInt() == N){
                println("$x $y ${z/1000}")
                return
            }
        }
    }
    println("-1 -1 -1")
    
}
