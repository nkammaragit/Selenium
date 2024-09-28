package practicePkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_BeforeAfter {
	
	
	
	  @BeforeClass
	    public void setup() {
	        System.out.println("Setup before all tests");
	    }

	    @AfterClass
	    public void teardown() {
	        System.out.println("Teardown after all tests");
	    }

	    @Test
	    public void testMethod1() {
	        System.out.println("This is test method 1");
	    }

	    @Test
	    public void testMethod2() {
	        System.out.println("This is test method 2");
	    }
}
