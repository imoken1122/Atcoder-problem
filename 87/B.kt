fun main(args: Array<String>) {
    var (a,b,c,x) = (1..4).map{
                readLine()!!.toInt()
                }
    var cnt = 0
    (0..a).map{i->
        (0..b).map{j->
            (0..c).map{k->
                if(x == 500*i+100*j+50*k) cnt++
            }
        }    
    }
    println(cnt)
}