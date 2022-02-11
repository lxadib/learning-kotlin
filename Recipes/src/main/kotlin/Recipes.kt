fun main(args: Array<String>) {
    val mushroom = Mushroom(6, true)
    println("mush size is ${mushroom.size} and is magic is ${mushroom.isMagic}")

    val mushroomTwo = Mushroom(false)
    println("The secound mushroom size is ${mushroomTwo.size} and it's magic is ${mushroomTwo.isMagic}")
}

data class Recipes(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
) {}

class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {}
}

fun findRecipes(
    title: String = "",
    ingredient: String = "",
    isVegetarian: Boolean = false,
    difficulty: String = ""
): Array<Recipes> {
    return arrayOf(Recipes(title, ingredient, isVegetarian, difficulty))
}

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun addNumbers(a: Double, b: Double): Double {
    return a + b
}

