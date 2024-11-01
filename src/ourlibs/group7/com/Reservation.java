package ourlibs.group7.com;


import ourlibs.group7.com.Lot;

public class Reservation {
    private int reservationID;
    private Lot lot;

    public Reservation(int reservationID, Lot lot) {
        this.reservationID = reservationID;
        this.lot = lot;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public Lot getLot() {
        return lot;
    }

    public void reserve() {
        if (lot.isAvailable()) {
            lot.setAvailable(false);
            System.out.println("Reservation successful for Lot in Block " + lot.getLocation().getBlockNumber());
        } else {
            System.out.println("Lot is already sold or reserved.");
        }
    }

    public void sell() {
        if (!lot.isAvailable()) {
            System.out.println("Sale successful for Lot in Block " + lot.getLocation().getBlockNumber());
        } else {
            System.out.println("This lot has not been reserved yet.");
        }
    }
}