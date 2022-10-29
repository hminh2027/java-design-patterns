package behavioral.chainOfResponsibility;

public class AuthenticationHandler implements Handler{
    private Handler handler;

    @Override
    public void handle(Request request) {
        if (request.getUsername().equals("admin") && request.getPassword().equals("123456")){
            if (handler != null) handler.handle(request);
        }
        else {
            System.out.println("ERROR: Username or password is incorrect!");
            return;
        }

    }

    @Override
    public void next(Handler handler) {
        this.handler = handler;
    }
}
