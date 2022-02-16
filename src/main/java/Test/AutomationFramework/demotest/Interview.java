package Test.AutomationFramework.demotest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Interview {
	public static void main(String[] args) {
		ArrayList al= new ArrayList(Arrays.asList(1,2,3,4,3,5,2));


		HashSet<Integer> hCheck= new HashSet();
		HashSet<Integer> tCheck= new HashSet();
		
		

		for(Object integer:al){
		  if(!hCheck.add((Integer) integer)){
		        tCheck.add((Integer) integer);
		}
		}
		 System.out.println("Duplicate values of array is ::"+tCheck);
	}

}
