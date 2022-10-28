package behavioral.state;

class PhoneContext implements PhoneState {
    private final PhoneState payingState;
    private final PhoneState lockedState;
    private final PhoneState unlockedState;

    private PhoneState state;

    public PhoneContext() {
        this.lockedState = new LockedState(this);
        this.payingState = new PayingState(this);
        this.unlockedState = new UnlockedState(this);

        this.state = lockedState;
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    @Override
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    public PhoneState getPayingState() {
        return payingState;
    }

    public PhoneState getUnlockedState() {
        return unlockedState;
    }

    public PhoneState getLockedState() {
        return lockedState;
    }
}
