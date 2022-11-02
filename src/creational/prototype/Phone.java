package creational.prototype;

public class Phone implements Cloneable {
    public int battery;
    public String chipName;
    public String screenType;
    public boolean hasSensor;

    public Phone(int battery, String chipName, String screenType) {
        this.battery = battery;
        this.chipName = chipName;
        this.screenType = screenType;
    }

    public Phone clone() {
        return new Phone(battery, chipName, screenType);
    }

    public void setHasSensor(boolean hasSensor) {
        this.hasSensor = hasSensor;
    }

    @Override
    public String toString() {
        return "Phone {" +
                "battery=" + battery +
                ", chipName='" + chipName + '\'' +
                ", screenType='" + screenType + '\'' +
                ", hasSensor=" + hasSensor +
                '}';
    }
}
