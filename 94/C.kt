fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map(String::toLong)

    for(i in 0..n-1){
        var B = A.map{it}.toMutableList()
        B.removeAt(i)
        
        println(B.sorted()[-1+(B.size + 1)/2])
    
    }
}