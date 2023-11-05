import People_Class.CabinCrewMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Chief Purser", "Bogdan");
    }

    @Test
    public void hasName(){
        assertEquals("Bogdan", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Chief Purser", cabinCrewMember.getRank());
    }
    @Test
    public void reliesMessage(){
        assertEquals("Welcome to the last flight of your lives.", cabinCrewMember.relayMessage());
    }
}
