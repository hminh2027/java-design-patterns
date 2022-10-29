package behavioral.template;

public abstract class LayoutTemplate {
    protected void renderHeader() {
        System.out.println("<header>This is a header</header>");
    }

    protected void renderFooter() {
        System.out.println("<footer>This is a footer</footer>");
    }

    protected void renderNavigation() {
        System.out.println("<nav>This is a navigation</nav>");
    }

    protected abstract void renderBody();

    public final void renderPage() {
        renderHeader();
        renderNavigation();
        renderBody();
        renderFooter();
    }
}
