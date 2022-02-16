package Test.AutomationFramework.demotest;

public class Interview2 {
	public static void main(String[] args) {
		
		
		int num=3456;

		int rem, n;
		int sum=0;
		
		while(num!=0) {
			
			rem= num%10;
			
			num= num/10;
			
			sum= sum+rem;
			
			
			
		}
		
		System.out.println("Sum of numbers is ::"+sum);
	
	}

}
