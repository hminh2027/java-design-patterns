package behavioral.state;

class PhoneContext implements PhoneState {
    private final PhoneState waitState;
    private final PhoneState lockedState;
    private final PhoneState unlockedState;

    private PhoneState state;

    public PhoneContext() {
        this.lockedState = new LockedState(this);
        this.waitState = new WaitState(this);
        this.unlockedState = new UnlockedState(this);

        this.state = lockedState;
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    @Override
    public void pressHomeButton() {

        System.out.println("Pressing Home button...");
        state.pressHomeButton();
    }

    public PhoneState getWaitState() {
        return waitState;
    }

    public PhoneState getUnlockedState() {
        return unlockedState;
    }

    public PhoneState getLockedState() {
        return lockedState;
    }
}
