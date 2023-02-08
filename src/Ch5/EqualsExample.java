package Ch5;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("str1==str2");
        } else {
            System.out.println("Str1 != str2");
        }
        if (strVar1.equals(strVar2)) {
            System.out.println("str1.equals(str2)");
        } else {
            System.out.println("문자열이 다름");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("str3 == str3");
        }else {
            System.out.println("Str3 != str43");
        }
        if (strVar3.equals(strVar4)){
            System.out.println("dd");
        }
    }
}
