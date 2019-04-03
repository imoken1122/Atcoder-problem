fun main(args: Array<String>) {
    
    var a = (1..4).map{
        readLine()!!.toInt()
    }
    println(Math.min(a[0],a[1]+Math.min(a[2],a[3])))
}
