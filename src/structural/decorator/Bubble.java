package structural.decorator;

public class Bubble extends ToppingDecorator{
    private final Beverage beverage;

    public Bubble(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + bubble (5)";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 5;
    }
}
