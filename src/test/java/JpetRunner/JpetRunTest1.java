package JpetRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//HERE WE NEED TO CREATE ALL THE PAGE OBJECT(TESTNG SCRIPT)

public class JpetRunTest1 {
  @Test
  public void f() 
  {
	  WebDriver wd = new FirefoxDriver();
	  wd.get("http://52.73.29.15:8000/#/");
  }
}

