package behavioral.chainOfResponsibility;

public class ValidationHandler implements Handler{
    private Handler handler;

    @Override
    public void handle(Request request) {
        if (request.getPassword().length() >= 6 && handler != null) {
            handler.handle(request);
        }
        else {
            System.out.println("ERROR: Password must have more than 6 characters!");
            return;
        }
    }

    @Override
    public void next(Handler handler) {
        this.handler = handler;
    }
}
