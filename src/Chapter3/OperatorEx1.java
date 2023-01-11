package Chapter3;

public class OperatorEx1 {
    public static void main(String[] args) {
        int i = 5;
        i++;
        System.out.println(i);

        i=5;
        ++i;
        System.out.println(i);

        int  j = 0;
        i = 5;
        j = i++;
        System.out.println("j=i++ 실행 후, i="+i + ", j=" + j);
        j = ++i;
        System.out.println("i="+i + " , j =" + j);

        i = 5;
        j = 5;
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i = " + i + ", j = " + j);

    }

}
