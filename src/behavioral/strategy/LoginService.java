package behavioral.strategy;


public class LoginService {
        private LoginStrategy strategy;

        public void setStrategy(LoginStrategy strategy) {
            this.strategy = strategy;
        }

        public void login() {
            this.strategy.login();
        }
}
