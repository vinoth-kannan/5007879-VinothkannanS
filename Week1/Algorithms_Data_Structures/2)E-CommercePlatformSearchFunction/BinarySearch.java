import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == productId) {
                return products[mid];
            }
            if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shirt", "Clothing"),
                new Product(3, "Book", "Books"),
                new Product(4, "Phone", "Electronics"),
                new Product(5, "Shoes", "Footwear")
        };

        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        Product result = binarySearch(products, 4);
        LinearSearch linear=new LinearSearch();
        Product result1 = linear.linearSearch(products, 3);
        if (result != null) {
            System.out.println("Using Binary Search Product found: " + result);
        } else {
            System.out.println("Product not found.");
        }
        if (result1 != null) {
            System.out.println("Using Linear Search Product found: " + result1);
        } else {
            System.out.println("Product not found.");
        }
    }
}
