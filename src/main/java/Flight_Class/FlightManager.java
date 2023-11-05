package Flight_Class;

public class FlightManager {
    private Flight flight;
    private int totalPlaneWeight;
    private int numberOfPassengersOnTheFlight;
    private double baggageWeightBookedByPassengers;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getTotalPlaneWeight() {
        return totalPlaneWeight;
    }

    public int getNumberOfPassengersOnTheFlight() {
        return numberOfPassengersOnTheFlight;
    }

    public double calculateBaggageWeightPerPassenger() {
        totalPlaneWeight = flight.getPlane().getTotalWeight();
        numberOfPassengersOnTheFlight = flight.getPassengers().size();
        return totalPlaneWeight / numberOfPassengersOnTheFlight;
    }

    public double calculateTotalBaggageWeightBookedByPassengers() {
        baggageWeightBookedByPassengers = 0.0;
        for (int i = 0; i < flight.getPassengers().size(); i++) {
            baggageWeightBookedByPassengers += flight.getPassengers().get(i).getNumberOfBags();
        }
        if (baggageWeightBookedByPassengers > flight.getPlane().getTotalWeight()) {
            System.out.println("The maximum weight has been passed. Remove some baggage.");
            return flight.getPlane().getTotalWeight() - baggageWeightBookedByPassengers;
        } else {
            System.out.printf("\nRemaining available weight: %f kg\n", flight.getPlane().getTotalWeight() - baggageWeightBookedByPassengers);
            return baggageWeightBookedByPassengers;
        }
    }
}

//        calculate how much baggage weight is booked by passengers of a flight
//        calculate how much overall weight reserved for baggage remains for a flight

