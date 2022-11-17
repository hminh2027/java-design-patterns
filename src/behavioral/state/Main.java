package behavioral.state;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing iphone... Default state is WAIT state");
        PhoneContext phoneContext = new PhoneContext();
        phoneContext.setState(phoneContext.getWaitState());
        phoneContext.pressHomeButton();
        phoneContext.pressHomeButton();
    }
}
