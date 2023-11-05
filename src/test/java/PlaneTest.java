import org.junit.Before;
import Plane_Class.Plane;
import Plane_Class.PlaneType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane (PlaneType.AIRBUS380);
    }
    @Test
    public void hasCapacity(){
        assertEquals(10, plane.getCapacity());
    }
    @Test
    public void hasTotalWeight(){
        assertEquals(50, plane.getTotalWeight());
    }
}
