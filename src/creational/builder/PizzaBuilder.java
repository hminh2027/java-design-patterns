package creational.builder;

public interface PizzaBuilder {
    void setSize();
    void setVegetable();
    void setMainIngredient();
    void setSource();
    Pizza getPizza();
}