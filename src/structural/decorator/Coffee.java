package structural.decorator;

public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee (50)";
    }

    @Override
    public double getPrice() {
        return 50;
    }
}
