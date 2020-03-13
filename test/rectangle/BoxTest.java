package rectangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoxTest {
    
    public BoxTest() {
    }
    
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Box instance = new Box(8, 15, 8);
        int expResult = 46;
        int result = instance.perimeter();
        assertEquals(expResult, result);
    }

    @Test
    public void testArea() {
        System.out.println("area");
        Box instance = new Box(8, 15, 8);
        assertEquals(120, instance.area());
    }
    
    @Test
    public void testVolume() {
        System.out.println("volume");
        Box instance = new Box(8, 15, 8);
        assertEquals(960, instance.volume());
    }
    
} //end class BoxTest

