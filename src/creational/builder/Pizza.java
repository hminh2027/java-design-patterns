package creational.builder;

public class Pizza {
    private Size size;
    private Vegetable vegetable;
    private MainIngredient mainIngredient;
    private Source source;
    private final String pizzaType;

    public Pizza(String pizzaType) {
        super();
        this.pizzaType = pizzaType;
    }

    @Override
    public String toString() {
        return pizzaType + " Pizza " + ": [size=" + size + ", vegetable=" + vegetable + ", mainIngredient=" + mainIngredient
                + ", source=" + source + "]";
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Vegetable getVegetable() {
        return vegetable;
    }

    public void setVegetable(Vegetable vegetable) {
        this.vegetable = vegetable;
    }

    public MainIngredient getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(MainIngredient mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}

enum Size {
    SMALL, MEDIUM, LARGE
}

enum Vegetable {
    PINEAPPLE, MUSHROOM, TOMATO
}

enum MainIngredient {
    SHRIMP, PEPPERONI, SAUSAGE
}

enum Source {
    KETCHUP, CHILLIES
}