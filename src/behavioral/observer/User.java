package behavioral.observer;

public class User implements Observer{
    private final String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String pagename) {
        System.out.println(username + ": \"" + pagename + "\" just uploaded a new post!");
    }
}
