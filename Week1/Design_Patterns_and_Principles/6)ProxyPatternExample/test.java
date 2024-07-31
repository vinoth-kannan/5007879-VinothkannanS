public class test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("picA.jpg");
        Image image2 = new ProxyImage("picB.jpg");
        image1.display();
        System.out.println();
        image2.display();
        System.out.println();
        image1.display();
    }
}