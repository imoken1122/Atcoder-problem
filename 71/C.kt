fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map(String::toLong).sorted()
    var ans = 1L
    var c = 0
    for(i in A.size-2 downTo 0 step 2){
        if(A[i] == A[i+1]){
            ans *= A[i]
            c++
            if(c == 2) break
        }
    }
    if(c == 0) println(0)
    else println(ans)
    
}

