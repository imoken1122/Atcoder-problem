fun main(args: Array<String>) {
    var (N,M) = readLine()!!.split(" ").map(String::toInt)
    var arr = IntArray(N,{0})
    (0..M-1).map{i->
        var (a,b) = readLine()!!.split(" ").map(String::toInt)
        arr[a-1]++
        arr[b-1]++
    }
    for(i in arr){
        println(i)
    }
}

