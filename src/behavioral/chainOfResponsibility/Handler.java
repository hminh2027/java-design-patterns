package behavioral.chainOfResponsibility;

public interface Handler {
    void handle(Request request);
    void next(Handler handler);
}
