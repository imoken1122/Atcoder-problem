fun main(args: Array<String>) {
    var (n,x) = readLine()!!.split(" ").map(String::toInt)
    var m = (1..n).map{
                 readLine()!!.toInt() 
            }
    println(n + (x - m.sum())/m.min()!!)
}