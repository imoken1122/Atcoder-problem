fun main(args: Array<String>) {
    var input = readLine()!!.split(" ").map{x->x.toInt()}
    var list = input.sorted()
    if(list[0] + list[1] == list[2]) println("Yes")
    else println("No")
}

