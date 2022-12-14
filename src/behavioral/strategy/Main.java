package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        loginService.setStrategy(new GithubStrategy());
        loginService.login();
        // set another strategy
        loginService.setStrategy(new FacebookStrategy());
        loginService.login();
    }
}
