package creational.singleton;

public class Database {
    public static String CONNECTION = "";

    public static String getConnection() {
        if (CONNECTION == "") {
            System.out.println("Không tìm thấy Connection! Đang khởi tạo...");
            CONNECTION = "Đây là đối tượng Connection!";
        }
        return CONNECTION;
    }
}
