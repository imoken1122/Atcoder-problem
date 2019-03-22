fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val F = (1..n).map {
                readLine()!!.split(" ").map(String::toInt)
            }
    val P = (1..n).map { 
            readLine()!!.split(" ").map(String::toInt)
            }
    
    val ans= mutableListOf<Int>()
    (0..1).map { a1 -> (0..1).map { a2 -> (0..1)
    .map { a3 -> (0..1).map { a4 -> (0..1)
    .map { a5 -> (0..1).map { a6 -> (0..1)
    .map { a7 -> (0..1).map { a8 -> (0..1)
    .map { a9 -> (0..1).map { a10 -> 
    val bits = listOf(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)
    if(bits.contains(1) == true){
        var score = F.mapIndexed{i,f->
            var and_sum = bits.zip(f).toList<Pair<Int,Int>>().map{
                        var (b1,b2) = it
                        b1*b2
                      }.sum()
            P[i][and_sum]
        }.sum()
        
        ans.add(score)
    }}}}}}}}}}}
    println(ans.max())
}
