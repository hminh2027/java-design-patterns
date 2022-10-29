package behavioral.chainOfResponsibility;

public class AuthorizationHandler implements Handler{
    private Handler handler;

    @Override
    public void handle(Request request) {
        if (request.getRole().equals("admin")) {
            System.out.println("SUCCESS: Logged in successfully!");
            if (handler != null) handler.handle(request);
        }
        else {
            System.out.println("ERROR: Only admin can access this page!");
            return;
        }
    }

    @Override
    public void next(Handler handler) {
        this.handler = handler;
    }
}
