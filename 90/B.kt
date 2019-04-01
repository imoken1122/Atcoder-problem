fun main(args: Array<String>) {
    
    var (a,b) = readLine()!!.split(" ").map(String::toInt)
    (a..b).map{
        var s = it.toString().toList()
        (0..2).map{i->
            s[i] == s[s.size-1-i]
        }.all{it==true}
    }.filter{it==true}.size.let{println(it)}
        
}
