package Test.AutomationFramework.syncronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test11 {
	
	public static void main(String[] args) {
		int [] array= {98,34,33,32,31,30,32,31,27,28,22,7,27,8,5,4,32,56,56,57,58,59,60,60,75};
		
		//1.remove duplicate numbers
		//2.print in ascending order
		
		LinkedHashSet<Integer> s= new LinkedHashSet();
		
		for(int i=0;i<array.length;i++) {
			s.add(array[i]);
		}
		
          ArrayList< Integer> al= new ArrayList<>();
          
          al.addAll(s);
           Collections.sort(al);
           System.out.println(al);
	}

}
