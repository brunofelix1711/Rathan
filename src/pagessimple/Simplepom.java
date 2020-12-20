package pagessimple;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simplepom {
	
WebDriver driver;

//signin Button
By signin = By.xpath("//a[@title='Log in to your customer account']");

//username
By username=By.name("email");

//password

By password=By.id("passwd");

//Login Button

By Login=By.id("SubmitLogin");


	
  @Test
  public void f() {
	  
	  this.driver=driver;
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	  
	  driver =new ChromeDriver();
	  
	  driver.get("http://automationpractice.com/index.php");
	  
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	  
	  driver.manage().window().maximize();
	  
	  //clicking webelement signin
	  
	  driver.findElement(signin).click();
	  
	  //sending username value
	  
	  driver.findElement(username).sendKeys("felixbruno1993@gmail.com");
	  
	  //sending password value
	  
	  driver.findElement(password).sendKeys("password5");
	  
	  //click login
	  driver.findElement(Login).click();
	  
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	  
  }
}
