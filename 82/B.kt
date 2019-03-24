fun main(args: Array<String>) {
    var (a,b) = (0..1).map{
            readLine()!!.toList().map(Char::toString)
            }
    if(a.sorted().joinToString("")<b.sorted().reversed().joinToString("")) println("Yes")
    else println("No")

}

