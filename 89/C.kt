fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var name = listOf('M','A','R','C','H')
    var cnt = Array(5,{0})
    (1..n).map{
        var s = readLine()!!
        if(name.contains(s[0])) cnt[name.indexOf(s[0])]++
    }
    var ans = 0
    (0..4).map{i->
        (i+1..4).map{j->
            (j+1..4).map{k->
                ans += cnt[i]*cnt[j]*cnt[k]
            }
        }
    }
    println(ans)
}
