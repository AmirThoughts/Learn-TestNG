package concepts.attributes;

import java.io.IOException;

import org.testng.annotations.Test;

public class AttributesTest {

	@Test(alwaysRun = true)
	public void alwaysRun() {
		System.out.println("Always Run");
	}

	@Test(description = "This is the dummy description of the test")
	public void descriptionTest() {
		System.out.println("Description");
	}

	@Test(priority = -3) // default priority is 0
	public void priorityOne() {
		System.out.println("Login Test 1");
	}

	@Test(priority = -5) // default priority is 0, It also can be negative
	public void priorityTwo() {
		System.out.println("Login Test 2");
	}

	@Test(dependsOnMethods = "descriptionTest")
	public void dependsOnMethods() {
		System.out.println("Depends on methods");
	}

	@Test(enabled = true)
	public void enabled() {
		System.out.println("Depends on methods");
	}

	@Test(expectedExceptions = { IOException.class }) // Passes
	public void exceptionTestOne() throws Exception {
		throw new IOException();
	}

	@Test(expectedExceptions = { IOException.class, NullPointerException.class }) // Fails
	public void exceptionTestTwo() throws Exception {
		throw new Exception();
	}

	@Test(groups = { "sanity, smoke" })
	public void groupsTest() {
		System.out.println("Login Test");
	}

	@Test(invocationCount = 10)
	public void invocationCount() {
		System.out.println("Login Test");
	}

}
