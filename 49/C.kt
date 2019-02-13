fun main(args: Array<String>) {
    val s = StringBuilder(readLine()!!)
    val list = listOf("dream","dreamer","erase","eraser")
 
    while (s.isNotEmpty()){
        val erase = list.find { s.endsWith(it) }
        if(erase==null){
            println("NO")
            return
        }else{
            s.delete(s.length-erase.length , s.length)
        }
        println(s)
    }
    println("YES")
}
