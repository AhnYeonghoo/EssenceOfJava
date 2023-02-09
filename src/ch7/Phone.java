package ch7;

public class Phone {

    public String model;
    public String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone 실행");
    }
    public void bell() {
        System.out.println("bell");
    }

    public void sendVoice(String message) {
        System.out.println(message);
    }

    public void receiveVoice(String message) {
        System.out.println(message);
    }

    public void hangUp() {
        System.out.println("hangUp");
    }

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        System.out.println(myPhone.wifi);
        myPhone.bell();
        myPhone.sendVoice("call");
        myPhone.receiveVoice("hi");
        myPhone.sendVoice("hi nice to meet you");
        myPhone.hangUp();
        myPhone.setWifi(true);
        myPhone.internet();
    }
}

class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("SmartPhone");
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("wifi on 혹은 off");
    }

    public void internet() {
        System.out.println("internet");
    }
}