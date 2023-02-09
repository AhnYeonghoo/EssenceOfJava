package ch7;

public abstract class Animal {

    public void breathe() {
        System.out.println("숨쉬기");
    }

    public abstract void sound();

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        aniamlSound(new Dog());
        aniamlSound(new Cat());

    }

    public static void aniamlSound(Animal animal) {
        animal.sound();
    }

}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
