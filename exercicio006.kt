fun main() {
    val firstUserEmailId : String = "user_one@gmail.com"
     val operatingSystem: String  = "Unknown OS"

    println(displayAlertMessage(operatingSystem,firstUserEmailId))
    println()

    val secondUserOperatingSystem: String = "Windows"
    val secondUserEmailId: String = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem: String = "Mac OS"
    val thirdUserEmailId: String = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
fun displayAlertMessage(a : String, b : String ){
    return println("There's a new sign-in request on $a for your Google Account $b ")
}
