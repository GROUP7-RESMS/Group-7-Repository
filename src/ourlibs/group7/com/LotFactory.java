package ourlibs.group7.com;


import ourlibs.group7.com.Lot;
import ourlibs.group7.com.Block;

public class LotFactory {
    public static Lot createLot(int size, Block block, double price) {
        return new Lot(size, block, price);
    }
}