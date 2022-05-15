fun main() {
    var likes: Int = 41
    val onePeople: String = "человеку"
    val manyPeople: String = "людям"
    if (likes == 1 || likes % 10 == 1)
        println("Понравилось $likes $onePeople")
    else println("Понравилось $likes $manyPeople")
}