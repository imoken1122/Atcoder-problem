fun main(args: Array<String>) {
    var N = readLine()!!.toList().map(Char::toString).map(String::toInt)
    var l:MutableList<Int> = mutableListOf()
    var op:List<Char> = listOf('+','-','+','-')
    for(i in 0..3 step 2){
      l.add(N[i] + N[i+1])
      l.add(N[i] - N[i+1])
    }
    
    for(i in 0..1){
        for(j in 2..3){
            var ans1=l[i]+l[j]
            var ans2=l[i]-l[j]
            
            if(ans1 == 7){
                println("${N[0]}${op[i]}${N[1]}+${N[2]}${op[j]}${N[3]}=7")
                return
            }
            if(ans2 == 7){
                println("${N[0]}${op[i]}${N[1]}-${N[2]}${op[j]}${N[3]}=7")
                return
            }
            
        }
    }
    
}

