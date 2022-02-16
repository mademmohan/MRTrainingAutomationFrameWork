package Test.AutomationFramework.Testngconcepts;

import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	@Test
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	@Test(enabled=false)
	public void m2() {
		
		System.out.println("This is m2 method");
	}
	
	@Test
	public void m3() {
		System.out.println("This is m3 method");
	}

}
