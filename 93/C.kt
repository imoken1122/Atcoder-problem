fun main(args: Array<String>) {
    var X = readLine()!!.split(" ").map(String::toInt).toMutableList()
    var cnt = 0

    while(true){
        var max = X.max()!!
        var min = X.min()!!
        var one2 = X.filter{it<max}
        if(X.toSet().size == 1) break
        else if(X.toSet().size == 3 || (max- min == 1 && one2.size==2)){
            X[X.indexOf(one2[0])]++
            X[X.indexOf(one2[1])]++
            cnt++
        }
        else{
            X[X.indexOf(min)] += 2
            cnt++
        }

    }
    println(cnt)

}
