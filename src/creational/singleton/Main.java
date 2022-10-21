package creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lần đầu gọi hàm getConnection():");
        System.out.println(Database.getConnection());
        System.out.println("Lần hai gọi hàm getConnection():");
        System.out.println(Database.getConnection());
        System.out.println("Lần ba gọi hàm getConnection():");
        System.out.println(Database.getConnection());
    }
}
