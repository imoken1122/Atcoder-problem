fun main(args: Array<String>) {
    var x = readLine()!!.toInt()
    var list = (1..32).map{
                it*it
                }

    var idx = list.indexOf(list.filter{it>=x}[0])
    if(list[idx]==x) println(list[idx])
    else println(list[idx-1])
}
