package creational.builder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder seaPizzaBuilder = new SeaPizzaBuilder();
        PizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();

        PizzaDirector chef = new PizzaDirector(seaPizzaBuilder);
        PizzaDirector chef2 = new PizzaDirector(cheesePizzaBuilder);

        chef.build();
        chef2.build();

        Pizza pizza = seaPizzaBuilder.getPizza();
        Pizza pizza2 = cheesePizzaBuilder.getPizza();

        System.out.println(pizza);
        System.out.println(pizza2);
    }
}
