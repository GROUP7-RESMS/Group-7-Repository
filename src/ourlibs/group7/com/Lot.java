package ourlibs.group7.com;


import ourlibs.group7.com.Block;

public class Lot {
    private int lotSize;
    private Block location;
    private double price;
    private boolean isAvailable;

    public Lot(int lotSize, Block location, double price) {
        this.lotSize = lotSize;
        this.location = location;
        this.price = price;
        this.isAvailable = true;
    }

    public int getLotSize() {
        return lotSize;
    }

    public Block getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayLot() {
        System.out.println("Lot Size: " + lotSize + " sq meters");
        System.out.println("Location: Block " + location.getBlockNumber());
        System.out.println("Price: " + price);
        System.out.println("Status: " + (isAvailable ? "Available" : "Sold"));
    }
}