
fun main(args: Array<String>) {
    var (x,t) = readLine()!!.split(" ").map(String::toInt)
    if(x-t < 0) println(0)
    else println(x-t)
}



