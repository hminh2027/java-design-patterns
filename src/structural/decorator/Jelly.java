package structural.decorator;

public class Jelly extends ToppingDecorator{
    private final Beverage beverage;

    public Jelly(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + jelly (3)";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 3;
    }
}
