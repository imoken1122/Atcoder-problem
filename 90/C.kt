fun main(args: Array<String>) {
    
    var (row,col) = readLine()!!.split(" ").map(String::toInt)
    var list = (0..row-1).map{
                    var a = mutableListOf<Int>()
                    (0..col-1).map{
                        a.add(0)
                    }
                    a
                }

    (0..row-1).map{r->
        (0..col-1).map{c->
            for(i in -1..1){
                if(i+r<0 || i+r>row-1) continue
                for(j in -1..1){
                    if(c+j<0 || c+j>col-1) continue
                    if(list[r+i][c+j] == 0) list[r+i][c+j]=1
                    else list[r+i][c+j] = 0
                }
            }
        }
    }

    println(list.flatten().sum())
}
