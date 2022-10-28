package behavioral.strategy;

public class GithubStrategy implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Logged in via Github account!");
    }
}
