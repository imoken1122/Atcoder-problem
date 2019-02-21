fun main(args: Array<String>) {
    var X = readLine()!!.toInt()
    var sum = 0
    for(i in 1..X){
        sum += i
        if(sum>=X){
            println(i)
            break
        }
    }
    
}

