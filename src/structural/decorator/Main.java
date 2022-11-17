package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage drink = new Coffee();
        drink = new Bubble(drink);
        System.out.println("Desc: "+ drink.getDescription());
        System.out.println("Price: "+ drink.getPrice());
        System.out.println("------------");
        drink = new MilkTea();
        drink = new Jelly(drink);
        drink = new Bubble(drink);
        drink = new Bubble(drink);
        System.out.println("Desc: "+ drink.getDescription());
        System.out.println("Price: "+ drink.getPrice());

    }
}
