fun main(args: Array<String>) {
    var I = readLine()!!.split(" ").map(String::toInt)
    if(I[0] == I[1]) println(I[2])
    else if(I[1] == I[2]) println(I[0])
    else println(I[1])
}

