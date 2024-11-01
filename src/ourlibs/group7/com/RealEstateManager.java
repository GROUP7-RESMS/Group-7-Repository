package ourlibs.group7.com;

import ourlibs.group7.com.Buyer;
import ourlibs.group7.com.Block;
import java.util.ArrayList;

public class RealEstateManager {
    private static RealEstateManager instance;
    private ArrayList<Block> blocks;
    private ArrayList<Buyer> buyers;

    private RealEstateManager() {
        blocks = new ArrayList<>();
        buyers = new ArrayList<>();
    }

    public static RealEstateManager getInstance() {
        if (instance == null) {
            instance = new RealEstateManager();
        }
        return instance;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    public void showAllLots() {
        for (Block block : blocks) {
            block.displayBlock();
        }
    }

    public void generateReport() {
        System.out.println("Real Estate Report:");
        showAllLots();
    }
}