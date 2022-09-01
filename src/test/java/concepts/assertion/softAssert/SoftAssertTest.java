package concepts.assertion.softAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void softAssert() {
		SoftAssert assertion = new SoftAssert();
		Assert.assertTrue(false, "Failed intentionally");
		Assert.assertEquals(10, 10, "Number mismatched");
		System.out.println("Tests executed successfully!");
		assertion.assertAll();
	}
}
