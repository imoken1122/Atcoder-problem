fun main(args: Array<String>) {
    var s : MutableList<Char> = mutableListOf()
    var S = readLine()!!.toList()
    S.map{x->
        when(x){
            '1' -> s.add(x)
            '0' -> s.add(x)
            else -> {
                if(s.size == 0) null
                else s.removeAt(s.size-1)
            }
        }
    }
    println(s.joinToString(""))
    
}

