func(args: Array<String>) {
    var (x,y,z) = readLine()!!.split(" ").map(String::toInt)
    // 空白は x/y +1 できるので、端っこの空白を xから引いて、座る幅と空白がxにいくつあるか
    println((x-z)/(y+z)) 
    
}

