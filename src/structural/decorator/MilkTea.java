package structural.decorator;

public class MilkTea implements Beverage{
    @Override
    public String getDescription() {
        return "Milk tea (40)";
    }

    @Override
    public double getPrice() {
        return 40;
    }
}
