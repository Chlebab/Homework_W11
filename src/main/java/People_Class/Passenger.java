package People_Class;

import Abstract.Person;

public class Passenger extends Person {

    private int numberOfBags;

    public Passenger(int numberOfBags, String name){
        super(name);
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
