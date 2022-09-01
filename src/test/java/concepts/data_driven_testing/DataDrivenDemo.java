package concepts.data_driven_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenDemo {

	@Test(dataProvider = "testData")
	public void loginTest(String username, String password) {
		System.out.println("Username is " + username + " and " + "Password is " + password);
	}

	@DataProvider
	public Object[][] testData() {
		return new Object[][] { 
			    { "validuser@gmail.com", "TestPassword@123" },
				{ "invaliduser@gmail.com", "InvalidPassword@123" },
				{ "emptypassword@gmail.com", "EmptyPassword@786" } };
	}
}
