fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var a = readLine()!!.split(" ").map{it.toInt()}
    a = ((a.sorted()).toSet()).toList()
    var min = 0
    
    (1..a.size-1).map{i->
        min += a[i] - a[i-1]
    }
    println(min)
    
}

