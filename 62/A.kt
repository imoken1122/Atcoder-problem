fun main(args: Array<String>) {
    var (x,y) = readLine()!!.split(" ").map(String::toInt)
    var l1 = listOf(1,3,5,7,8,10,12)
    var l2 = listOf(4,6,9,11)
    var l3 = listOf(2)
    if(l1.contains(x)&&l1.contains(y) || l2.contains(x)&&l2.contains(y) || l3.contains(x)&&l3.contains(y)){
        println("Yes")
    }
    else println("No")
}

