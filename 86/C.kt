fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var tr = (1..N).map{
                     var (tt,xx,yy) = readLine()!!.split(" ").map(String::toInt)
                     Triple(tt,xx,yy)
                }
    var t = 0
    var x = 0
    var y = 0
    var flag = false
    tr.map{
        var (t_,x_,y_) = it
        var d = Math.abs(x_ - x) + Math.abs(y_ - y)
        var dt = t_ - t
        if(d<=dt && dt%2 == d % 2) flag = true
        else flag = false
        t = t_
        x = x_
        y = y_
    }
    print(flag)
    if(flag) println("Yes")
    else println("No")
}


