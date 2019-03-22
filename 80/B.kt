fun main(args: Array<String>) {
    var N = readLine()!!.toList().map(Char::toString).map(String::toLong)
    var sum = 0L
    N.map{n->
        sum += n
    }
    if(N%sum == 0) println("Yes")
    else println("No")
    
}

