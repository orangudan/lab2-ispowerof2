import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    //Should be divisible by 2
    public void testIsPowerOf2() {
        for (int i = 0; i < 100; i++) {
            if (App.isPowerOf2(i) && i > 1) {
                assertEquals(true, i % 2 == 0);
            }
        }
    }

    //If a is a power of 2, then 2a is a power of 2
    @Test
    public void ifAThen2ATest() {
        for (int i = 0; i < 100; i++ ) {
            if (App.isPowerOf2(i)) {
                assertEquals(true, App.isPowerOf2(2 * i));
            }
        } 
    }

    @Test
    public void negativeFail() {
        assertEquals(false, App.isPowerOf2(-2.0));
    }

    @Test
    public void assertOneTrue() {
        assertEquals(true, App.isPowerOf2(1));
    }

    @Test
    public void ifNotAThenNot2A() {
        for (int i = 0; i < 100; i++ ) {
            if (!App.isPowerOf2(i)) {
                assertEquals(false, App.isPowerOf2(2 * i));
            }
        } 
    }
}
