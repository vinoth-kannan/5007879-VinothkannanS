public class test {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Vinoth", 1050.75),
                new Order(2, "kannan", 1500.0),
                new Order(3, "saravanan", 867.85),
                new Order(4, "harshini", 900.75)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        BubbleSort.bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Order[] orders2 = {
                new Order(1, "Mani", 350.51),
                new Order(2, "velan", 450.02),
                new Order(3, "vijay", 500.25),
                new Order(4, "ajith", 300.75)
        };

        QuickSort.quickSort(orders2, 0, orders2.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        for (Order order : orders2) {
            System.out.println(order);
        }
    }
}
