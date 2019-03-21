fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var l : MutableList<Long> = mutableListOf(2,1)
    var L = 0L
    (2..N).map{i->
        L = l[i-1] + l[i-2]
        l.add(L)
    }
    println(l[l.size-1])
}

