fun main(args: Array<String>) {
    var N = readLine()!!.toLong()
    for(i in N downTo 0){
        var j = i.toDouble()
        var sq = (Math.sqrt(j)).toLong()
        
        if(sq * sq == i){
            println(i)
            break
        }
    }    
}   

