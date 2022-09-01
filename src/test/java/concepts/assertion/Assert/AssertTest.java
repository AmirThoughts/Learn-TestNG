package concepts.assertion.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {

	@Test
	public void assertTest() {
		Assert.assertTrue(false, "Failed intentionally");
		Assert.assertEquals(10, 10, "Number mismatched");
		System.out.println("Tests executed successfully!");
	}

}
