package Ch5;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);
        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("java");
        } else {
            System.out.println("nojava");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("java");
        } else {
            System.out.println("no java");
        }
    }
}
