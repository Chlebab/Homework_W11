package People_Class;

import Abstract.Person;

public class CabinCrewMember extends Person {

    private String rank;


    public CabinCrewMember (String rank, String name){
        super(name);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Object relayMessage(){
        return "Welcome to the last flight of your lives.";
    }
}

