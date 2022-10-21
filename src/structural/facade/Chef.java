package structural.facade;

public class Chef {
    public void findIngredients() {
        System.out.println("Chef is looking for ingredients...");
    }

    public void cook(String food) {
        System.out.println("Chef is cooking " + food);
    }
}
