fun main(args: Array<String>) {
    var N = readLine()!!.toList().map(Char::toString).map(String::toInt)
    //符号の24通りの組み合わせ生成
    0.until(8).map { n->
        0.until(3).map { i->
            if((n and (1 shl i)) != 0) {1} else {-1}
         }
        }.filter{N[0]+ it[0]*N[1]+it[1]*N[2]+it[2]*N[3] == 7}[0].let{
            var op = it.map{x-> when(x){ -1-> {'-'} else -> {'+'}}}
            println("${N[0]}${op[0]}${N[1]}${op[1]}${N[2]}${op[2]}${N[3]}=7")
        }

}

