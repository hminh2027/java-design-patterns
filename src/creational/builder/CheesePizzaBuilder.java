package creational.builder;

public class CheesePizzaBuilder implements PizzaBuilder {
    private final Pizza pizza = new Pizza("Cheese");

    @Override
    public void setSize() {
        pizza.setSize(Size.LARGE);
    }

    @Override
    public void setVegetable() {
        pizza.setVegetable(Vegetable.PINEAPPLE);
    }

    @Override
    public void setMainIngredient() {
        pizza.setMainIngredient(MainIngredient.PEPPERONI);
    }

    @Override
    public void setSource() {
        pizza.setSource(Source.KETCHUP);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
