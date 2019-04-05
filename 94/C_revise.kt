fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map(String::toInt)
    var A_sorted = A.sorted()
    var m_idx = n/2

    A.map{
        if(it<A_sorted[m_idx]) println(A_sorted[n/2])
        else println(A_sorted[n/2-1])
    }
    
}