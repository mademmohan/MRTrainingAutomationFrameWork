package Test.AutomationFramework.Testngconcepts;

import org.testng.annotations.Test;

public class TestNGonInvocationCount {

	@Test(invocationCount = 10)
	public void m1() {
		
		System.out.println("M1 method in class");
	}
}
