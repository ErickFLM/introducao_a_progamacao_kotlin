fun main() {
    println(temp("São paulo", 20, 28, 10))
    println(temp("Minas Gerais", 21, 30, 20))
    println(temp("Amazonas", 22, 31, 30))
    println(temp("Mato Grosso", 23, 32, 40))
 } 
 fun temp(city : String, baixo : Int, alto : Int, chuva : Int):Unit{
     println("Cidade: $city")
     println("Temp minima: $baixo Temp maxima: $alto")
     println("Chance de chuva: $chuva%")
     println()
 }