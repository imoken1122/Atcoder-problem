fun main(args: Array<String>) {
    var s = readLine()!!.toString()
    var c = 0
    for(i in 1..s.length-1){
        if(s[i-1] != s[i]) c++
    }
    println(c)
}
