package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Fanpage page = new Fanpage("The Cat Lovers");
        User user1 = new User("Minh");
        User user2 = new User("John");
        //
        page.subscribe(user1);
        page.subscribe(user2);
        //
        page.uploadPost("This cat is so beautiful!");
        //
        page.unsubscribe(user1);
        page.unsubscribe(user2);
        page.uploadPost("Meow meow!");

    }
}
