fun main(){
    val hoje = 300
    val ontem = 250
    val resu = comparar(hoje, ontem)
    println("você passou mais tempo hoje no celular do que ontem? resposta: $resu ")
}
fun comparar(hoje: Int, ontem: Int): Boolean{
     return hoje > ontem
}
