package behavioral.state;

public class PayingState implements PhoneState{
    private final PhoneContext phoneContext;

    public PayingState(PhoneContext phoneContext) {
        this.phoneContext = phoneContext;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Invoice payed!");
        phoneContext.setState(phoneContext.getUnlockedState());
    }
}
