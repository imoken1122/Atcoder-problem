fun main(args: Array<String>) {
    var S = readLine()!!
    for(i in (S.length-2 downTo 0)){
        var s = S.slice(0..i)
        if(s.length % 2 != 0) continue
        if(s.slice(0..i/2) == s.slice(i/2 + 1 .. i)){
            println(s.length)
            break
        }
    }
}

