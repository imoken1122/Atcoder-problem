fun main(args: Array<String>) {
    var (n,k) = readLine()!!.split(" ").map(String::toInt)
    var input = readLine()!!.split(" ").map{it.toInt()}
    input = input.sorted()
    var sum = 0
    var len = input.size-1
    for (i in len downTo len-(k-1)){
        sum += input[i]
    }
    println(sum)
}

