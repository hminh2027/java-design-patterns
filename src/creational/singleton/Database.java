package creational.singleton;

public class Database {
    public static String CONNECTION = "";

    public static String getConnection() {
        if (CONNECTION.equals("")) {
            System.out.println("Connection not found! Initializing...");
            CONNECTION = "This is Connection Object!";
        }
        return CONNECTION;
    }
}