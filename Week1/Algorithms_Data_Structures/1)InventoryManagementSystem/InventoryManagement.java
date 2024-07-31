import java.util.HashMap;

public class InventoryManagement {
    private HashMap<String, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found");
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public void printInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();

        Product product1 = new Product("1", "Laptop", 5, 62500.50);
        Product product2 = new Product("2", "Smartphone", 10, 26999.99);

        inventoryManagement.addProduct(product1);
        inventoryManagement.addProduct(product2);

        System.out.println("Inventory after adding products:");
        inventoryManagement.printInventory();

        product1.setPrice(899.99);
        inventoryManagement.updateProduct("1", product1);

        System.out.println("Inventory after updating product:");
        inventoryManagement.printInventory();

        inventoryManagement.deleteProduct("2");

        System.out.println("Inventory after deleting product:");
        inventoryManagement.printInventory();
    }
}
