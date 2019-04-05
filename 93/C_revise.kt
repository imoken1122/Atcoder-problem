fun main(args: Array<String>) {
    var X = readLine()!!.split(" ").map(String::toInt).toMutableList()
    var max = X.max()!!
    var tmp = (max*3 - X.sum())
    if(tmp%2 == 0) println(tmp/2)
    else println(((max+1)*3 - X.sum())/2)
}