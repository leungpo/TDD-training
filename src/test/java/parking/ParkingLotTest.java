package parking;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class ParkingLotTest {

	@Test
	public void should_return_a_parking_ticket_when_parking_a_car_given_a_parking_lot_and_a_car() {
	    //given
	    ParkingLot parkingLot = new ParkingLot();
		Car car = new Car();
	    //when
		Ticket ticket = parkingLot.park(car);
	    //then
		assertNotNull(ticket);
	}

}
