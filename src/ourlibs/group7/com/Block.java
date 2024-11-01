package ourlibs.group7.com;

public class Block {
    private int blockNumber;
    private Lot[] lots;

    public Block(int blockNumber, int lotCount) {
        this.blockNumber = blockNumber;
        this.lots = new Lot[lotCount];
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public Lot[] getLots() {
        return lots;
    }

    public void addLot(Lot lot, int index) {
        if (index >= 0 && index < lots.length) {
            lots[index] = lot;
        }
    }

    public void displayBlock() {
        System.out.println("Block Number: " + blockNumber);
        for (Lot lot : lots) {
            if (lot != null) {
                lot.displayLot();
            }
        }
    }
}