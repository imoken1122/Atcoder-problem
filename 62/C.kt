fun main(args: Array<String>) {
    var (H,W) = readLine()!!.split(" ").map(String::toInt)
    var a = (H/2).toInt()
    var b = (H/3).toInt()
    var c = (W/2).toInt()
    var d = (W/3).toInt()
    var pattern = mutableListOf(a+d+1,b+c+1,H,W)
    if(H%3 == 0 || W%3 == 0) pattern.add(0)
    if(H%2==0) pattern.add(a)
    if(W%2 == 0) pattern.add(c)
    println(pattern.min()!!)
}

