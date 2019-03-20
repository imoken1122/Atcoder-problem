fun main(args: Array<String>) {
    var (x,y) = readLine()!!.split(" ")
    if(x>y) println('>')
    else if(x<y) println('<')
    else println('=')
}

