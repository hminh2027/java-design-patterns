package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler authenHandler = new AuthenticationHandler();
        Handler authorHandler = new AuthorizationHandler();
        Handler validationHandler = new ValidationHandler();

        Request request = new Request("admin", "123456", "admin");

        validationHandler.next(authenHandler);
        authenHandler.next(authorHandler);

        System.out.println("Start logging into application...");
        System.out.println(request);
        validationHandler.handle(request);
    }
}
