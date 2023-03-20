package parking;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ParkingLotTest {

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void should_return_a_parking_ticket_when_parking_a_car_given_a_parking_lot_and_a_car() {
	    //given
	    ParkingLot parkingLot = new ParkingLot(1);
		Car car = new Car();
	    //when
		Ticket ticket = parkingLot.park(car);
	    //then
		assertNotNull(ticket);
	}

	@Test
	public void should_return_a_car_when_fetch_car_given_a_parked_car_and_parking_lot_and_ticket() {
	    //given
	    ParkingLot parkingLot = new ParkingLot(1);
		Car car = new Car();
		Ticket ticket = parkingLot.park(car);
	    //when
	    Car returnCar = parkingLot.fetch(ticket);
	    //then
		assertEquals(returnCar, car);
	}

	@Test
	public void should_return_UnrecognizedTicketException_when_wrong_ticket_given_a_parked_car_and_parking_lot() {
	    //given
		ParkingLot parkingLot = new ParkingLot(1);
		Car car = new Car();
		Ticket ticket = parkingLot.park(car);
	    Ticket wrongTicket = new Ticket();
		//when
		exceptionRule.expect(UnrecognizedTicketException.class);
		exceptionRule.expectMessage("unrecognized ticket");
		parkingLot.fetch(wrongTicket);
	}

	@Test
	public void should_return_FullParkingException_when_park_car_given_parking_lot_without_any_position() {
	    //given
		ParkingLot parkingLot = new ParkingLot(1);
		Car car = new Car();
		parkingLot.park(car);
		Car anotherCar = new Car();
	    //when & then
		exceptionRule.expect(FullParkingException.class);
		exceptionRule.expectMessage("Full parking lot");
		parkingLot.park(anotherCar);
	}

}
