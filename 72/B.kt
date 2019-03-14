
fun main(args: Array<String>) {
    var s = readLine()!!.toList()
        .mapIndexed{i,x->
        Pair(i,x)    
        }.filter{
            it.first %2 == 1
        }.map{it.second}.joinToString()
    print(s)
}
