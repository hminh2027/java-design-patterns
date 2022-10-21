package creational.builder;

public class SeaPizzaBuilder implements PizzaBuilder {
    private final Pizza pizza = new Pizza("Sea");

    @Override
    public void setSize() {
        pizza.setSize(Size.LARGE);
    }

    @Override
    public void setVegetable() {
        pizza.setVegetable(Vegetable.TOMATO);
    }

    @Override
    public void setMainIngredient() {
        pizza.setMainIngredient(MainIngredient.SHRIMP);
    }

    @Override
    public void setSource() {
        pizza.setSource(Source.CHILLIES);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
