package structural.facade;

public class RestaurantFacade {
    Chef chef;
    Waiter waiter;
    Cashier cashier;

    public RestaurantFacade() {
        this.chef = new Chef();
        this.waiter = new Waiter();
        this.cashier = new Cashier();
    }

    public void order(String food) {
        waiter.takeOrder(food);
        chef.findIngredients();
        chef.cook(food);
        waiter.serveFood(food);
    }

    public void pay() {
        cashier.printInvoice();
    }
}
