fun main(args: Array<String>) {
    var (H,W) = readLine()!!.split(" ").map(String::toInt)
    repeat(W+2){print("#")}
    print("\n")
    for(i in 1..H){
        var s = readLine()!!.toString()
        println("#"+s+"#")
    }
    repeat(W+2){print("#")}
    print("\n")
}

