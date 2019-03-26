fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var a = (1..N-1).map{
        readLine()!!.split(" ").map(String::toInt)
    }
    for( i in 0..N-2){
        var ans = 0
        for(j in i..N-2){
            var C = a[j][0]
            var S = a[j][1]
            var F = a[j][2]
            if(S>ans) ans = S
            else if(ans.toDouble()%F == 0.0) ans += 0
            else ans = F+ans - (ans.toDouble()%F).toInt()
            ans += C
            
        }
        println(ans)
    }
    println(0)
   
}

