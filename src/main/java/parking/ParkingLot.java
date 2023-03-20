package parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    Map<Ticket, Car> parkedCar = new HashMap<>();
    public Ticket park(Car car) {
        Ticket ticket = new Ticket();
        parkedCar.put(ticket, car);
        return ticket;
    }

    public Car fetch(Ticket ticket) {
        return parkedCar.get(ticket);
    }
}
