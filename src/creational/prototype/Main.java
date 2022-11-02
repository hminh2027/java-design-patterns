package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(1000, "SnapDragon", "ICD");
        Phone nokia = phone.clone();
        Phone iphone = phone.clone();

        nokia.setHasSensor(false);
        iphone.setHasSensor(true);

        System.out.println("Default - " + phone);
        System.out.println("Nokia - " + nokia);
        System.out.println("Iphone - " + iphone);
    }
}
