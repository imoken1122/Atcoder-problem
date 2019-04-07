fun main(args: Array<String>) {
    var (h,w) = readLine()!!.split(" ").map(String::toInt)
    var S = (1..h).map{
                readLine()!!.toList().map{it.toString()}
            }    
    var size = (0..h-1).map{y->
                    (0..w-1).map{x->
                        var a = S[y][x]
                        if(a == "#"){
                            var list = mutableListOf<String>()

                            if(y!=0) list.add(S[y-1][x])
                            if(x!=0) list.add(S[y][x-1])
                            if(y!=h-1) list.add(S[y+1][x])
                            if(x!=w-1) list.add(S[y][x+1])
                            list.filter{it=="#"}.size >= 1
                        }
                        else null
                    }
                }.flatten().mapNotNull{ it }.filter{it==true}.size
    if(size !=0) println("Yes")
    else println("No")
    
}
