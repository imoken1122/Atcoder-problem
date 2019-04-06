fun main(args: Array<String>) {
    var (a,b,c,x,y) = readLine()!!.split(" ").map(String::toInt)
    var one_chg = Math.min(a+b,c*2)
    var ans = Math.min(x,y)*one_chg
    var sa = Math.abs(x-y)
    if(x>y) ans += Math.min(sa*a,sa*c*2)
    else ans += Math.min(sa*b,sa*c*2) 
    println(ans)
}