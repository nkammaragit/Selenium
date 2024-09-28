package webDriverTest;

import org.testng.annotations.Test;

public class TestNGExample {

    @Test
    public void initialize() {
        System.out.println("Initialization");
    }
    
    

	    @Test(dependsOnMethods = {"initialize"})
	    public void testMethod() {
	        System.out.println("This test depends on initialization");
    }
}

