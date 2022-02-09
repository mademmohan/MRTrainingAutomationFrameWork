
package Test.AutomationFramework.syncronization;

import java.util.Random;

 class RandomNumberGenerator {
	
	public static void main(String[] args) {
		Random generator= new Random();

		String stripperNum;

		int num1=0;
		int num2=0;
		int num3=0;


		num1= generator.nextInt(600) +100;

		num2= generator.nextInt(641) + 100;

		num3= generator.nextInt(8999) + 100;

		String string1= Integer.toString(num1);
	//	stripperNum= toOctalString(num1);


		//System.out.println(stripperNum+""+num2+""+num3);
	}



}
