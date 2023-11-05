package People_Class;
import Abstract.Person;

public class Pilot extends Person {
    private String rank;
    private String licenceNumber;


    public Pilot(String name, String rank, String licenceNumber) {
        super(name);
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public Object fliesThePlane(){
        return "This plane is being flown by " + getName();
    }
}
