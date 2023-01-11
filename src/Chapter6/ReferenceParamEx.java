package Chapter6;


class Data2 {
    int x;
}
public class ReferenceParamEx {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum="+sumArr(arr));

        ReferenceParamEx T = new ReferenceParamEx();

        int result = T.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};
        T.add(3, 5, result2);
        System.out.println(result2[0]);

        Data2 d = new Data2();
        d.x = 10;
        Data2 d2 = copy(d);
        System.out.println(d.x);
        System.out.println(d2.x);
        System.out.println();
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println("]");
    }

    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    int add (int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }

    static Data2 copy(Data2 d) {
        Data2 tmp = new Data2();
        tmp.x = d.x;
        return tmp;
    }
}


