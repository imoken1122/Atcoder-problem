fun main(args: Array<String>) {
    var s = readLine()!!
    var K = readLine()!!.toInt()
    var a = (0..s.length-1).map{i->
                (0..s.length-1).map{j->
                    s.slice(i..j)
                }

            }.flatten().toSet().filter{it.length<=K && it!=""}.sorted()
    println(a[K-1])
}
