package ourlibs.group7.com;

public class Buyer {
    private int buyerID;
    private String buyerName;
    private Reservation reservation;

    public Buyer(int buyerID, String buyerName) {
        this.buyerID = buyerID;
        this.buyerName = buyerName;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void makeReservation(int reservationID, Lot lot) {
        this.reservation = new Reservation(reservationID, lot);
        reservation.reserve();
    }

    public void finalizeSale() {
        if (reservation != null) {
            reservation.sell();
        } else {
            System.out.println("No reservation to finalize.");
        }
    }

    public void displayBuyer() {
        System.out.println("Buyer ID: " + buyerID);
        System.out.println("Buyer Name: " + buyerName);
    }
}