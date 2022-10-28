package creational.builder;

public class PizzaDirector {
    PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.setSize();
        builder.setVegetable();
        builder.setMainIngredient();
        builder.setSource();
    }
}
