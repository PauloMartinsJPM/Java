import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking( 11, LocalDateTime.of(2022,8,3, 14,0),
        LocalDateTime.of(2022,8,3,18,0));

        Parking parking1 = new Parking( 11, LocalDateTime.of(2022,8,4, 14,0),
        LocalDateTime.of(2022,8,4,18,0));

        System.out.println(parking.calculateCharges());
        System.out.println(parking1.calculateCharges());

        System.out.println(Duration.between(parking.getDepartureDate(), parking.getEntryDate()));

        System.out.println(parking.getDepartureDate());

        Duration d = Duration.between(parking.getEntryDate(), parking.getDepartureDate());

        long hours = d.toHours();
        System.out.println(hours);
    
    }
    
}
