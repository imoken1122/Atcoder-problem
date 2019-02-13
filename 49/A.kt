fun main(args: Array<String>) {
    var c = readLine()!!.toList()[0]
    when(listOf('a','b','c','e','o').contains(c)){
        true ->println("vowel")
        false-> println("consonant")
    }
}

