package groupe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertEquals("Hello World!",App.hello());
    }

    /**
     * VERY Rigorous Test :D
     */
    @Test
    public void shouldreturn0() {
        assertEquals(0,App.calcul(69));
    }
}
