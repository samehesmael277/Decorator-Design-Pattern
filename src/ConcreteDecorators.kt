// ConcreteDecorator
class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Int {
        return super.cost() + 2
    }
}

// Another ConcreteDecorator
class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Int {
        return super.cost() + 1
    }
}
