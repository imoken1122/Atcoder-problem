fun main(args: Array<String>) {
    (0..2).map{
        var a = readLine()!!
        a[it]
        }.let{ println(it.joinToString(""))}
}
