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
        if(isUnrecognizedTicket(ticket)){
            throw new UnrecognizedTicketException();
        }
        return parkedCar.get(ticket);
    }

    private boolean isUnrecognizedTicket(Ticket ticket) {
        return !parkedCar.containsKey(ticket);
    }
}
