ifun main(args: Array<String>) {
    var (W,a,b) = readLine()!!.split(" ").map(String::toInt)
    if(a<b){
        if(W+a>=b) println(0)
        else println(b -(W+a))
    }
    else{
        if(W+b>=a) println(0)
        else println(a -(W+b))
    }
}

