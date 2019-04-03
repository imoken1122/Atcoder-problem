fun main(args: Array<String>) {
    var N = readLine()!!.toInt() + 2
    var A = readLine()!!.split(" ").map(String::toInt).toMutableList()
    A.add(0,0)
    A.add(N-1,0)
    var a_sum = (1..N-1).map{
                    Math.abs(A[it-1] - A[it])
                }.sum()
    
    for(it in 1..N-2){
        var d = Math.abs(A[it-1] - A[it]) + Math.abs(A[it] - A[it+1])
        var new = Math.abs(A[it-1] - A[it+1]) //it=0 it=1 it=2
        println(a_sum - d + new)
    }
    
}
