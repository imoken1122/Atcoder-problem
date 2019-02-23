fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var S = (1..N).map{
        readLine()!!.toList().map{x->x.toInt()-'a'.toInt()}
    }
    var min_arr = IntArray(26,{50}) // n<50
    S.map{s->
        var frq = IntArray(26,{0})
        s.map{i->frq[i]++}
        (0..25).map{i->
            min_arr[i] = Math.min(min_arr[i],frq[i])
        }
    }
    for(i in 0..25){
        repeat(min_arr[i]){
            print((i+'a'.toInt()).toChar())
        }
    }
}

