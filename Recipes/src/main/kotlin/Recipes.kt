data class Recipes(val name: String, val isVegetarian: Boolean) {
    init {
        "the name is $name"
    }
}


fun main(args: Array<String>) {
    var r1 = Recipes("Adib", true)
    println(r1)
}