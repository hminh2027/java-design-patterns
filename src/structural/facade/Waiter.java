package structural.facade;

public class Waiter {
    public void takeOrder(String food) {
        System.out.println("Waiter is taking your order: " + food);
    }
    public void serveFood(String food) {
        System.out.println("Waiter is serving your " + food + "...");
    }
}
