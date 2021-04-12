package MyProject;
import org.junit.Test;
import static org.junit.Assert.*;
public class RootsTest {

    private Main main = new Main();

    /** Test for no roots */
    @Test
    public void test1() {

        String testOne = main.calculateRoots(5, 4,3);
        assertEquals("No real roots", testOne);
    }
    /** Test for only one root */
    @Test
    public void test2() {

        String testTwo = main.calculateRoots(9, -12,4);
        assertEquals("Only one real root", testTwo);
    }
    /** Test for two roots */
    @Test
    public void test3() {

        String testTwo = main.calculateRoots(1, 3,2);
        assertEquals("Two real roots", testTwo);
    }

}
