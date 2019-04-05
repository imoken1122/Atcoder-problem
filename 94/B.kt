fun main(args: Array<String>) {
    var (n,m,x) = readLine()!!.split(" ").map(String::toInt).toMutableList()
    var A = readLine()!!.split(" ").map(String::toInt).toMutableList()
    var r = A.filter{it<x}.size
    var l = A.filter{it>x}.size
    println(Math.min(r,l))
}