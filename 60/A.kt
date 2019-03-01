fun main(args: Array<String>) {
    var (a,b,c) = readLine()!!.split(" ")
    if(a[a.length-1] == b[0]){
        if(b[b.length-1] == c[0]) println("YES")
        else println("NO")
    }
    else println("NO")
}

