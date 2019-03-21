 fun main(args: Array<String>) {
    var N = readLine()!!
   for(n in N){
       if(N.filter{it==n}.length>=3) {
           println("Yes")
           return
       }
   }
   println("No")
}

