fun main(args: Array<String>) {
    var N= readLine()!!.toInt()
    var input = (1..N).map{
                readLine()!!.toInt()
            }.toList()
    var idx = 0
    for(i in 1..N){
        var next_i =input[idx]
        if(next_i == 2){
            println(i)
            return
        }
        idx = next_i-1
    }
    
    println(-1)
}

