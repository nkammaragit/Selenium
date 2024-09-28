package practicePkg;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testException() {
    	System.out.println("Testing exception");
        int result = 1 / 0;
    }
}