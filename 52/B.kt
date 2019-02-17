fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var S = readLine()!!.toString()
    var max = 0
    var x = 0
    (0..N-1).map{i->
        if (S[i] == 'I')x++
        else x--
        
        if(max<x) max = x
    }
    println(max)
   
}
<Paste>
