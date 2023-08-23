package TC_LF_001;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TS_LF_001 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver wd = new FirefoxDriver();	
		FileReader fr = new FileReader("./TestData/testdata.properties");
		Properties p=new Properties();
		// Loading properties file to access
		p.load(fr);
		wd.get(p.getProperty("baseurl"));


		//Avoid providing static test data
		// keep the  test data in properties file
		wd.findElement(By.name("username")).clear();
		wd.findElement(By.name("username")).sendKeys(p.getProperty("unm"));
	}

}
