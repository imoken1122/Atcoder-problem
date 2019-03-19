fun main(args: Array<String>) {
    var N = readLine()!!.toLong()
    var A = readLine()!!.split(" ").map{it.toLong()}
    var B = readLine()!!.split(" ").map{it.toLong()}
    var C = readLine()!!.split(" ").map{it.toLong()}
    var cnt = A.map{a->
             B.filter{ b-> 
                a<b
                }.map{b-> 
                    C.filter{c-> c>b}}
            }.flatten().flatten().size
    println(cnt)
}   

