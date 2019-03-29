fun main(args: Array<String>) {
    var (x,a,b) = (1..3).map{
                readLine()!!.toInt()
                }
    println((x-a) - ((x-a)/b)*b)
}