fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var input = readLine()!!.split(" ").map{it.toInt()}
    var output : MutableList<Int> = mutableListOf()
    input.map{x->
        output.add(x)
        output.reverse()
    }
    println(output.joinToString(" "))
}
