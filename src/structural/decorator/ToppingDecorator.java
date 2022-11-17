package structural.decorator;

public abstract class ToppingDecorator implements Beverage{
    @Override
    public String getDescription() {
        return "Toppings";
    }
    @Override
    public double getPrice() {
        return 0;
    }
}
