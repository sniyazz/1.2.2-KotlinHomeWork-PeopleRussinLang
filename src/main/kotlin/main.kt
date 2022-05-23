fun main() {
    var likes: Int = 141
    var text: String
    if (likes % 10 == 1 && likes !== 11 && likes % 100 !== 11) {
        text = "Понаравилось $likes  человеку"
    } else {
        text = "Понаравилось $likes  людям"
    }
    println(text)
}