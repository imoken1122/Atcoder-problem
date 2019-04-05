fun main(args: Array<String>) {
    var s = readLine()!!.split("").sorted()
    if(s.joinToString("") == "abc") println("Yes")
    else println("No")
}
