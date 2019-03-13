fun main(args: Array<String>) {
    var (x,a,b) = readLine()!!.split(" ").map(String::toInt)
    if(Math.abs(x-a)<Math.abs(x-b)) println("A")
    else println("B")
}

