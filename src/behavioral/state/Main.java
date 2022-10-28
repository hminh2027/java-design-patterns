package behavioral.state;

public class Main {
    public static void main(String[] args) {
        PhoneContext phoneContext = new PhoneContext();
        phoneContext.pressHomeButton();
        phoneContext.pressHomeButton();
        //
        phoneContext.setState(phoneContext.getPayingState());
        phoneContext.pressHomeButton();
        phoneContext.pressHomeButton();
    }
}
