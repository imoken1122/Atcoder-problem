fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map(String::toLong)
    var c = 0
    var a = A
    while(a.filter{it%2==0L}.size == A.size){
        a = a.map{it/2}
        c++
    }
    println(c)
}

