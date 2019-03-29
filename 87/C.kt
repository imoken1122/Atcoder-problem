fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var A_up = readLine()!!.split(" ").map(String::toInt)
    var A_dw = readLine()!!.split(" ").map(String::toInt)
    (0..N-1).map{i->
        A_up.slice(0..i).sum() + A_dw.slice(i..N-1).sum()
    }.max().let{
        println(it)
    }
}