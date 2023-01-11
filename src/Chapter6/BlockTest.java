package Chapter6;

class BlockTest {
    static {
        System.out.println("static {}");
    }

    {
        System.out.println("{}");
    }

    public BlockTest() {
        System.out.println("contructor");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
        /*
        static contructor block은 메모리에 로딩될 때 단 한 번만 실행
        반면 instance contructor block은 instance 생성 때 마다 실행됨
         */
    }


}

