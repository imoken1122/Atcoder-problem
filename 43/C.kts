fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var input = readLine()!!.split(" ").map(String::toInt)
    var list : MutableList<Int> = mutableListOf()
    val max_v = input.max()!!
    val min_v = input.min()!!
    var sum = 0
    for(vv in min_v..max_v){
        sum = 0
        for(v in input){
            sum += (v - vv) * (v - vv)
        }
        list.add(sum)
    }
    println(list.min()!!)
}
