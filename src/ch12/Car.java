package ch12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Car {

    private String model;
    private String owner;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;

        System.out.println(clazz);

        System.out.println(clazz.getPackage().getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());

        System.out.println();
        System.out.println("[생성자 정보]");
        Constructor[] con = clazz.getDeclaredConstructors();
        for (Constructor c : con) {
            System.out.println(c.getName());
            Class[] parameters = c.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getType().getName()+ " " + f.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.print(m.getName()+ "(");
            Class[] parameters = m.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
    }
    private static void printParameters(Class[] parameters) {
        for (int i=0; i<parameters.length; i++) {
            System.out.print(parameters[i].getName());
            if(i<(parameters.length-1)) {
                System.out.print(",");
            }
        }
    }
}
