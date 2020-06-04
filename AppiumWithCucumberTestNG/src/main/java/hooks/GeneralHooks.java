package hooks;

import java.net.MalformedURLException;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHooks {
    
	
	@Before
	public void setUp() throws MalformedURLException {
       System.out.println("***********Before HooK");
       
	}
    
	
	@After
	public void tearDown() {
		System.out.println("***********After HooK");
	}

}
