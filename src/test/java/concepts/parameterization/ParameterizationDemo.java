package concepts.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo {

	@Parameters({ "browser" })
	@Test
	public void parameterTest(String browser) {
		System.out.println("Parameterized value is : " + browser);
	}
}
