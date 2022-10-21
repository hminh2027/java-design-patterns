package structural.facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the restaurant:");
        new RestaurantFacade().order("Beef Steak");
        System.out.println("Pay for the meal:");
        new RestaurantFacade().pay();
        System.out.println("Leave the restaurant");
    }
}
