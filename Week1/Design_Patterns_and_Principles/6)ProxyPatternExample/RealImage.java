public class RealImage implements Image {
    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }
    private void loadImageFromDisk() {
        System.out.println("Loading image from local storage : " + filename);
    }
    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}