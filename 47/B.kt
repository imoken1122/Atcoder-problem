fun fill(a: Array<Array<Int>>,xx : Int , yy : Int, f : Int, h :Int,w : Int) : Array<Array<Int>>{
        
        when(f){
            1 ->{
                 for(i in 0..h-1){
                     for(j in 0..xx-1){
                         a[i][j] = 1
                     }
                 }
             }
             2 ->{
                for(i in 0..h-1){
                     for(j in xx..w-1){
                         a[i][j] = 1
                     }
                 }
             }
             3 ->{
                 var yy_ = h - yy
                 for(i in yy_..h-1){
                     for(j in 0..w-1){
                         a[i][j] = 1
                     }
                 }
             }
             else ->{
                var yy_ = h - yy
                 for(i in 0..yy_-1){
                     for(j in 0..w-1){
                         a[i][j] = 1
                     }
                 }
             }
         }
         return a
}
fun main(args: Array<String>) {
    var (W,H,N) = readLine()!!.split(" ").map(String::toInt)
    var arr = Array(H, {Array(W, {0})})
    var sum = 0
    for(i in 0..N-1){
         var (x,y,a) = readLine()!!.split(" ").map(String::toInt)
         
         arr = fill(arr,x,y,a,H,W)
    }
    for(i in 0..H-1){
        sum += arr[i].sum()
    }
    print(H * W - sum)
}

