package Flight_Class;

import People_Class.CabinCrewMember;
import People_Class.Passenger;
import People_Class.Pilot;
import Plane_Class.Plane;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        if(pilots.isEmpty()) {
            throw new IllegalStateException("No pilots available");
        } else return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void addPilot(Pilot pilot){
        pilots.add(pilot);
    }
    public void removePilot(Pilot pilot) {
        pilots.remove(pilot);
    }
    public void addCabinCrewMember(CabinCrewMember crewMember) {
        cabinCrewMembers.add(crewMember);
    }
    public void removeCabinCrewMember(CabinCrewMember crewMember) {
        cabinCrewMembers.remove(crewMember);
    }
    public void addPassengers(Passenger passenger){
        if(plane.getCapacity() - passengers.size() <= 0) {
            System.out.println("No seats remaining");
        } else {
            passengers.add(passenger);
            int remainingSeats = plane.getCapacity() - passengers.size();
            System.out.printf("\nThere are %d seats remaining\n", remainingSeats);
        }
    }
    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }

}

