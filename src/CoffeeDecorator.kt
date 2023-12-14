abstract class CoffeeDecorator(private val coffee: Coffee) : Coffee {
    override fun cost(): Int {
        return coffee.cost()
    }
}