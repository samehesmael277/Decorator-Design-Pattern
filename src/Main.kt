fun main() {
    // Simple coffee
    val simpleCoffee: Coffee = SimpleCoffee()
    println("Cost of simple coffee: ${simpleCoffee.cost()}")

    // Coffee with milk
    val coffeeWithMilk: Coffee = MilkDecorator(simpleCoffee)
    println("Cost of coffee with milk: ${coffeeWithMilk.cost()}")

    // Coffee with sugar
    val coffeeWithSugar: Coffee = SugarDecorator(simpleCoffee)
    println("Cost of coffee with sugar: ${coffeeWithSugar.cost()}")

    // Coffee with both milk and sugar
    val coffeeWithMilkAndSugar: Coffee = SugarDecorator(MilkDecorator(simpleCoffee))
    println("Cost of coffee with milk and sugar: ${coffeeWithMilkAndSugar.cost()}")
}