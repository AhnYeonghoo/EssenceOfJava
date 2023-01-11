package Chapter6;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println(p1.serialNo);
        System.out.println(p2.serialNo);
        System.out.println(p3.serialNo);
        System.out.println(Product.count);

    }
}
class Product {
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public Product() {}
}

