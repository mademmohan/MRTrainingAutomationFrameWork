package Test.AutomationFramework.Testngconcepts;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test (priority = 2)
	public void m1() {

		System.out.println("This is m1 method");
	}
	@Test (priority = 3)
	public void m2() {
		System.out.println("This is m2 method");
	}
	@Test (priority = -1)
	public void m3() {
		System.out.println("This is m3 method");
	}
	
	@Test
	public void m4() {
		System.out.println("This is m4 method");
	}
	
	@Test(priority=0)
	public void m5() {
		
		System.out.println("This is m5 method");
	}

}


