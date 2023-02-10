package ch8;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {

        Remote rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
        Searchable searchable = new SmartTelevision();
        searchable.search("https://youtube.com");
    }
}
