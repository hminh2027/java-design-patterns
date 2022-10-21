package creational.builder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder seaPizzaBuilder = new SeaPizzaBuilder();
        PizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();

        Director chef = new Director(seaPizzaBuilder);
        Director chef2 = new Director(cheesePizzaBuilder);

        chef.build();
        chef2.build();

        Pizza pizza = seaPizzaBuilder.getPizza();
        Pizza pizza2 = cheesePizzaBuilder.getPizza();

        System.out.println(pizza);
        System.out.println(pizza2);
    }
}
