package behavioral.state;

public class LockedState implements PhoneState{
    private final PhoneContext phoneContext;

    public LockedState(PhoneContext phoneContext) {
        this.phoneContext = phoneContext;
    }

    @Override
    public void pressHomeButton() {
        phoneContext.setState(phoneContext.getUnlockedState());
        System.out.println("Phone screen turned on!");
    }
}
