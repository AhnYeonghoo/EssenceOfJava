package ch11;

public class ExceptionHandlelingExample {

    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i < array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println(value);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } catch(NumberFormatException | NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("progrin exception");
            }
        }
    }
}
