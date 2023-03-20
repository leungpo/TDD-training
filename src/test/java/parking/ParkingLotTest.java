package parking;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

	@Test
	public void should_return_a_car_when_fetch_car_given_a_parked_car_and_parking_lot_and_ticket() {
	    //given
	    ParkingLot parkingLot = new ParkingLot();
		Car car = new Car();
		Ticket ticket = parkingLot.park(car);
	    //when
	    Car returnCar = parkingLot.fetch(ticket);
	    //then
		assertEquals(returnCar, car);
	}

}
