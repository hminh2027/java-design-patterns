package creational.builder;

public class Director {
    PizzaBuilder builder;

    public Director(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.setSize();
        builder.setVegetable();
        builder.setMainIngredient();
        builder.setSource();
    }
}
