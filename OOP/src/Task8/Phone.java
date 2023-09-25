package Task8;

public class Phone {
    private String brand;
    private String version;
    private String screen;
    private int memory;
    private double price;

    public Phone(String brand, String version, String screen) {
        this.brand = brand;
        this.version = version;
        this.screen = screen;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", "Galaxy S21", "6.2 inches");
        Phone phone2 = new Phone("Apple", "iPhone 12", "6.1 inches");

        phone1.setMemory(128);
        phone1.setPrice(799.99);

        phone2.setMemory(256);
        phone2.setPrice(899.99);

        System.out.println("Phone 1:");
        System.out.println("Brand: " + phone1.getBrand());
        System.out.println("Version: " + phone1.getVersion());
        System.out.println("Screen: " + phone1.getScreen());
        System.out.println("Memory: " + phone1.getMemory() + " GB");
        System.out.println("Price: $" + phone1.getPrice());

        System.out.println();

        System.out.println("Phone 2:");
        System.out.println("Brand: " + phone2.getBrand());
        System.out.println("Version: " + phone2.getVersion());
        System.out.println("Screen: " + phone2.getScreen());
        System.out.println("Memory: " + phone2.getMemory() + " GB");
        System.out.println("Price: $" + phone2.getPrice());
    }
}

