package behavioral.template;

public class HomePage extends LayoutTemplate{
    @Override
    protected void renderBody() {
        System.out.println("<div>Welcome to HOMEPAGE!</div>");
    }
}
