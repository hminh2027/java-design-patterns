package behavioral.state;

public class WaitState implements PhoneState{
    private final PhoneContext phoneContext;

    public WaitState(PhoneContext phoneContext) {
        this.phoneContext = phoneContext;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Changing to unlocked state!");
        phoneContext.setState(phoneContext.getUnlockedState());
    }
}
