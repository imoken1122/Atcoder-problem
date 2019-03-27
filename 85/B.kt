fun main(args: Array<String>) {
    // Your code here!
    var N = readLine()!!.toInt()
    
    var ans = (1..N).map{
                    readLine()!!.toInt()
                }.toSet().size
    println(ans)     
    
}
