fun main(args: Array<String>) {
    var x = readLine()!!.toLong()
    var t = x/11L
    var e = when{
        x%11L>6 -> 2
        x%11L>0 -> 1
        else -> 0
        }
    println(t*2+e)
}

