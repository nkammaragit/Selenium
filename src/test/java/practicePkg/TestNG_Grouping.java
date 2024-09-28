package practicePkg;

import org.testng.annotations.Test;

public class TestNG_Grouping {
	
	
	  @Test(groups = {"smoke"})
	    public void testMethod1() {
	        System.out.println("This is a smoke test method");
	    }

	    @Test(groups = {"regression"})
	    public void testMethod2() {
	        System.out.println("This is a regression test method");
	    }
	
	
}
