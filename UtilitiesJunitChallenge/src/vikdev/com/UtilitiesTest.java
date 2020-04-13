package vikdev.com;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        fail("Failed");
    }

    @org.junit.Test
    public void removePairs() {
        Utilities utilities = new Utilities();
        assertNull(utilities.removePairs(null));
        assertEquals("ABCD", utilities.removePairs("ABBCDD"));


    }

    @org.junit.Test
    public void converter() {
        fail("Failed");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        fail("Failed");
    }
}