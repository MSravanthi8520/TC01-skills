package BasicLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NonStaticMethods {
	 WebDriver driver;
  @Test
 
  
  
  
  
  public  void CallallMethods() 
  
  {
	  NonStaticMethods S1=new NonStaticMethods();
	  
	  S1.ChromeDriver();
	  S1.OpenOrangeHRM();
  }
  
  
  
  
  
  public  void ChromeDriver() 
  {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  
  }
  
  

  public  void OpenOrangeHRM() 
  {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
  }
  
}
