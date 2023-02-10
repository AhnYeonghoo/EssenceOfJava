package ch8;

public class SmartTelevision implements Searchable, Remote{

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "를 검색합니다.");
    }
}
