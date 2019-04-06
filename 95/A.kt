fun main(args: Array<String>) {
    var x = readLine()!!.split("")
    println(700 + 100* x.filter{it=="o"}.size) 
}