fun main(args: Array<String>) {
    var dict : MutableMap<Char,MutableList<Char>> = mutableMapOf()
    dict['a'] = readLine()!!.toMutableList()
    dict['b'] = readLine()!!.toMutableList()
    dict['c'] = readLine()!!.toMutableList()
    var turn = 'a'
    while(true){
        var list = dict[turn]
        if(list!!.size == 0){
            println(turn.toUpperCase())
            break
        } 
        turn = list[0]
        list.removeAt(0)
    }
}

