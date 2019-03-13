fun main(args: Array<String>) {
    var s = readLine()!!.toSet().sorted()
    var tmp=s[0]
    
    for(i in 1..s.size-1 ){
        if(s[i].toInt() - tmp.toInt() >= 2){
            println((tmp.toInt() + 1).toChar())
            return 
        }
        tmp = s[i]
    }
    
    if(s.size != 26) println((s[s.size-1].toInt() + 1).toChar())
    else println("None")
}

