public class Item {
    // member variables
    private String name;
    private double price;

    // contructor method
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // name setter
    public void setName(String newName) {
        this.name = newName;
    }

    // name getter
    public String getName() {
        return name;
    }

    // price setter
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    // price getter
    public double getPrice() {
        return price;
    }
}
