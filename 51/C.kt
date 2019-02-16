fun main(args : Array<String>) { 
  val (sx,sy,tx,ty) = readLine()!!.split(" ").map(String::toInt)
  println("U".repeat(ty - sy) + "R".repeat(tx - sx+1) + "D".repeat(ty - sy+1) + "L".repeat(tx - sx+1) + "U"+
         "R".repeat(tx-sx) + "U".repeat(ty - sy+1) + "L".repeat(tx - sx + 1)+ "D".repeat(ty - sy + 1)+ "R")
}

