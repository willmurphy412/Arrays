fun main() {
    var ingredients = arrayOf<String>("Bun","Beef","Cheese","Ketchup","Mustard","Mayo","Lettuce")
    var i = 0

    println("This is a list of ingredients for burgers:")
    while(i < ingredients.size){
        print("${ingredients[i]}, ")
        i++
    }
}