package behavioral.state;

public class UnlockedState implements PhoneState{
    private final PhoneContext phoneContext;

    public UnlockedState(PhoneContext phoneContext) {
        this.phoneContext = phoneContext;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Returned home screen!");
    }
}
