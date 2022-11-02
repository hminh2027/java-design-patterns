package behavioral.state;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing iphone... Default state is LOCKED state");
        PhoneContext phoneContext = new PhoneContext();
        phoneContext.pressHomeButton();
        phoneContext.pressHomeButton();
        System.out.println("--------------------------------");
        System.out.println("Initializing iphone... Default state is PAYING state");
        phoneContext.setState(phoneContext.getPayingState());
        phoneContext.pressHomeButton();
        phoneContext.pressHomeButton();
    }
}
