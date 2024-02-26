// faça um progama de soma e subtração com 2 funções e intutivo

fun main(){
    val a = 10
    val b = 5
    val c = 8
      val resuAdd = add(a,b)
     val resuSub = sub(a,c)
    
    println("O resultado de $a + $b é $resuAdd")
     println("O resultado de $a - $c é $resuSub")
}
fun add(a : Int, b : Int) : Int{
     return a + b
}
fun sub(a : Int, c : Int) : Int{
     return a - c
}
