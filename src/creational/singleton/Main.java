package creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("First time call getConnection():");
        System.out.println(Database.getConnection());
        System.out.println("Second time call getConnection():");
        System.out.println(Database.getConnection());
        System.out.println("Third time call getConnection():");
        System.out.println(Database.getConnection());
    }
}
