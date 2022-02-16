package Test.AutomationFramework.Testngconcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesFileLoading {
	
	public static void main(String[] args) throws IOException {
		
		  String location=System.getProperty("user.dir");
		  
		  File f= new File(location+"\\files\\Data.properties");
		  
		  BufferedReader reader= new BufferedReader(new FileReader(f));
		  
		  Properties pr= new Properties();
		  pr.load(reader);
		  
		  
		  System.out.println(pr.get("Url"));
	}

}
