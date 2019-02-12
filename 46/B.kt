fun main(args: Array<String>) {
    // Your code here!
    var input = readLine()!!.split(" ").map{x->x.toDouble()}
    var ans = input[1]
    if(input[0]!=1.0) println((input[1] * Math.pow(ans-1,input[0]-1)).toLong())
    else println(input[1].toInt())
    
}
