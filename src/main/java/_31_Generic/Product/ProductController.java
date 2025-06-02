package _31_Generic.Product;

public class ProductController {
    public static void main(String[] args) {
        Product<String> product1 = new Product<>("Laptop", "DDDDD");
        System.out.println(product1);
        Product<Double> product2 = new Product<>("iPad", 23.45);
        System.out.println(product2);
        Product<Boolean> product3 = new Product<>("E", true);
        System.out.println(product3);
    }
}
