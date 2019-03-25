fun main(args: Array<String>) {
    var (N,a,b) = readLine()!!.split(" ").map(String::toInt)
    var ans = 0
    (1..N).map{ idx->
        idx.toString().map{
            it.toString().toInt()
            }.sum().let{
                when{
                    a<=it && it<=b -> idx
                    else -> 0
                }
            }
    }.sum().let{
        print(it)
    }
}

