import Flight_Class.Flight;
import People_Class.CabinCrewMember;
import People_Class.Passenger;
import People_Class.Pilot;
import Plane_Class.Plane;
import Plane_Class.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;
    Passenger passenger9;
    Passenger passenger10;
    Passenger passenger11;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        pilot1 = new Pilot("Dezyderiusz", "First Officer", "1337");
        pilot1 = new Pilot("Weronika", "Capitan", "1338");
        cabinCrewMember1 = new CabinCrewMember("Chief Purser", "Marek");
        cabinCrewMember2 = new CabinCrewMember("Flight attendant ", "Piotr");
        cabinCrewMember3 = new CabinCrewMember("Senior crew member ", "Andrzej");
        passenger1 = new Passenger(1, "Borek1");
        passenger2 = new Passenger(2, "Borek2");
        passenger3 = new Passenger(3, "Borek3");
        passenger4 = new Passenger(1, "Borek4");
        passenger5 = new Passenger(2, "Borek5");
        passenger6 = new Passenger(3, "Borek6");
        passenger7 = new Passenger(1, "Borek7");
        passenger8 = new Passenger(2, "Borek8");
        passenger9 = new Passenger(3, "Borek9");
        passenger10 = new Passenger(1, "Borek10");
        passenger11 = new Passenger(2, "Borek11");
        flight = new Flight(plane, "FR9909", "Edinbirgh", "Glasgow", "11/11/2023 20:30");
    }
    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
    }
    @Test
    public void hasPlaneCapacity(){
        assertEquals(20, flight.getPlane().getCapacity());
    }
    @Test
    public void hasTotalWeight(){
        flight.setPlane(new Plane(PlaneType.BOEING787DREAMLINER));
        assertEquals(150, flight.getPlane().getTotalWeight());
    }
    @Test
    public void hasPilots(){
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        assertEquals(2, flight.getPilots().size());
    }
    @Test
    public void hasCabinCrewMembers(){
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
        assertEquals(3, flight.getCabinCrewMembers().size());
    }
    @Test
    public void hasEmptyListOfBookedPassengers(){
        assertEquals(0, flight.getPassengers().size());
    }
    @Test
    public void returnsNumberOfSeats(){
        flight.setPlane(new Plane(PlaneType.AIRBUS380));
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        flight.addPassengers(passenger4);
        flight.addPassengers(passenger5);
        flight.addPassengers(passenger6);
        flight.addPassengers(passenger7);
        flight.addPassengers(passenger8);
        flight.addPassengers(passenger9);
        flight.addPassengers(passenger10);
        flight.addPassengers(passenger11);
        assertEquals(10, flight.getPassengers().size());
    }


}
