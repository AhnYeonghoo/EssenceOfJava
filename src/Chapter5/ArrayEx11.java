package Chapter5;

public class ArrayEx11 {
    public static void main(String[] args) {
        String[] names = {"kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++)
            System.out.println("names {"+ i + "}: "+ names[i]);

        String temp = names[2];
        System.out.println("temp: "+ temp);
        names[0] = "Yu";
        for (String str : names)
            System.out.println(str);

        System.out.println();

        char[] hex = {'C', 'A', 'F', 'E'};

        String[] binary = { "0000", "0001", "0010", "0011"
                            ,"0100", "0101", "0110", "0111"
                            ,"1000", "1001", "1010", "1011"
                            , "1100", "1101", "1110", "1111"};
        String result = "";

        for (int i = 0; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i]-'0'];
            } else {
                result += binary[hex[i] - 'A' + 10];
            }
        }
        System.out.println("hex: " + new String(hex));
        System.out.println("binary: " + result);
    }
}
