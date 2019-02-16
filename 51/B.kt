fun main(args : Array<String>) { 
  val (K, S) = readLine()!!.split(" ").map { x -> x.toInt() } 
  var t = (0..K).map{x->
    (0..K).map{y ->
        var z = S -x -y
        if(z >= 0 && z <= K) 1
        else 0
        }
    }.flatMap{x->x}.sum()
  println(t)
}

