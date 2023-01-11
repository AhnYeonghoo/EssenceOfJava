package Chapter5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        System.out.println("[before change]");
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]: " +arr[i]);
        }

        int[] tmp = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp;

        System.out.println("[after change]");
        System.out.println("Arr.length: " +arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]: "+arr[i]);
        }

        System.out.println();

        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6' ,'7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        System.arraycopy(abc, 0, num ,6, 3);
        System.out.println(num);
    }
}
