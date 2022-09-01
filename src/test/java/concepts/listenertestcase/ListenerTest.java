package concepts.listenertestcase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import concepts.listeners.ITestListenerClass;

@Listeners(ITestListenerClass.class)
public class ListenerTest {

	@Test(priority = 1)
	public void firstTest() {
		System.out.println("First test");
		Assert.assertTrue(true);

	}

	@Test(priority = 2)
	public void secondTest() throws InterruptedException {
		System.out.println("Second test");
		Assert.fail();

	}

	@Test(priority = 3, timeOut = 1000)
	public void thirdTest() throws InterruptedException {
		System.out.println("Third test");
		Thread.sleep(2000);

	}

	@Test(priority = 4, dependsOnMethods = "thirdTest")
	public void ultimateTest() {
		System.out.println("Last test");

	}

}
