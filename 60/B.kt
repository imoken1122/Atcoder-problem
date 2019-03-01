fun main(args: Array<String>) {
    var (a,b,c) = readLine()!!.split(" ").map(String::toInt)
    var sum = a
    var flag = 0
    for(i in 1..1000000){
        if(sum%b == c) {
            flag = 1
            break
        }
        sum += a
    }
    if(flag==1) println("YES")
    else println("NO")
}

