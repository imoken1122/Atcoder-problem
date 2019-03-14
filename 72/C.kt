fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var a = readLine()!!.split(" ").map(String::toInt)
    var arr = IntArray(10e5.toInt() + 1,{0})
    (0..n-1).map{i->
        if(a[i] != 0) arr[a[i]-1]++
        arr[a[i]]++
        arr[a[i]+1]++
    }
    println(arr.max()!!)
        
}
