fun main(args: Array<String>) {
    var x = readLine()!!.split(" ").map(String::toInt).toMutableList()
    var k = readLine()!!.toInt()
    (1..k).map{
        x[x.indexOf(x.max()!!)] *= 2
    }    
    println(x.sum())
}
