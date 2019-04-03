fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map(String::toInt)
    var c = 0

    var a_sum = (1..N-1).map{
                    Math.abs(A[it-1] - A[it])
                }.sum()
    var start = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]) + Math.abs(A[0] - A[2])
    println(a_sum-start)
    for(it in 1..N-2){
        var d = Math.abs(A[it-1] - A[it]) + Math.abs(A[it] - A[it+1])
        var new = Math.abs(A[it-1] - A[it+1]) //it=0 it=1 it=2
        println(a_sum-d + new)
    }
    var end =Math.abs(A[N-3] - A[N-2]) + Math.abs(A[N-2] - A[N-1]) + Math.abs(A[N-3] - A[N-1])
    println(a_sum-end)
}
