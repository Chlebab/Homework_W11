import People_Class.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot ("Małgorzata", "First Officer", "WWW1337");
    }
    @Test
    public void hasName(){
        assertEquals("Małgorzata", pilot.getName());
    }
    @Test
    public void hasRank(){
        assertEquals("First Officer", pilot.getRank());
    }
    @Test
    public void hasLicenceNumber(){
        assertEquals("WWW1337", pilot.getLicenceNumber());
    }
    @Test
    public void hasFlyingPilot(){
        assertEquals("This plane is being flown by Małgorzata", pilot.fliesThePlane());
    }
}
