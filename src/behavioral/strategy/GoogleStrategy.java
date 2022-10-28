package behavioral.strategy;

public class GoogleStrategy implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Logged in via Google account!");
    }
}
