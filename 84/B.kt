fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map(String::toInt)
    var S = readLine()!!
    if(S[a] == '-' && S.length == a+b+1 && S.filter{it == '-'}.length == 1) println("Yes")
    else println("No")
}

