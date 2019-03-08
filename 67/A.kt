fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map(String::toInt)
        if(a%3 == 0 || b%3==0 || (a + b) %3==0) println("Possible")
        else println("Impossible")
}
