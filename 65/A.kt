fun main(args: Array<String>) {
    var (x,a,b) = readLine()!!.split(" ").map(String::toInt)
    if(a>=b) println("delicious")
    else{
        if(b-a>x) println("dangerous")
        else println("safe")
    }

}

