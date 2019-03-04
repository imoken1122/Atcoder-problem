fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var min = 101
    var sum = 0
    (1..N).map{
        var s = readLine()!!.toInt()
        sum += s
        if(sum%10 != 0) {
            if(min>s) min = s
        }
    }
    if(min == 101) println(0)
    else if(sum%10 != 0) println(sum)
    else println(sum - min)
}

