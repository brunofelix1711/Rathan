package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProviderTest {
	 @Test(dataProvider="rathan", dataProviderClass=Dataprovider.class)
	   
	   public void launchBrowser(String uname, String pword) throws InterruptedException {
	   
        System.out.println("launching chrome browser"); 
        System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe" );
        
         WebDriver  driver = new ChromeDriver();
         Thread.sleep(300);
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		driver.findElement(By.xpath(("//input[@id='passwd']"))).sendKeys(pword);
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
}
}