package behavioral.template;

public class Main {
    public static void main(String[] args) {
        LayoutTemplate page = new HomePage();
        page.renderPage();
        System.out.println("-----------");
        page = new ProductPage();
        page.renderPage();
    }
}
