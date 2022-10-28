package behavioral.strategy;

public class FacebookStrategy implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Logged in via Facebook account!");
    }
}
