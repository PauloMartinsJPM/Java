import java.time.Duration;
import java.time.LocalDateTime;

public class Parking {
    private int parkingSpot;
    private LocalDateTime entryDate;
    private LocalDateTime departureDate;

    public Parking() {
    }

    public Parking(int parkingSpot, LocalDateTime entryDate, LocalDateTime departureDate) {
        this.parkingSpot = parkingSpot;
        this.entryDate = entryDate;
        this.departureDate = departureDate;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public Double calculateCharges() {npm
        Duration stay = Duration.between(getEntryDate(), getDepartureDate());

        long hours = stay.toHours();

        double price = 0;

        if (hours >0 && hours <=3) price = 2.00;

        if (hours >3 && hours <=17 ){
            price = 2.00 + ((hours - 3) * 0.5);
       }
        if (hours >17 && hours <=24)
            price = 10.00;
        return price;
    }
}