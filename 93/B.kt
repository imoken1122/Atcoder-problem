fun main(args: Array<String>) {
    var (a,b,K) = readLine()!!.split(" ").map(String::toLong)
    for(i in a..b){
        if(i < a+K || i>b-K) println(i)
    }
}
