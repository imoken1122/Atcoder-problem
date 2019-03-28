fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ")
    var tm = (a + b).toDouble()
    if(tm.toInt() == Math.sqrt(tm).toInt()*Math.sqrt(tm).toInt()) println("Yes")
    else println("No")
}


