package testonly;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.UdumeyLoginPage;

@Listeners(pages.UdumeyLoginPage.class)
public class UdumeyTestcase {
	
	//we have to initialize drivers here
	@Parameters({"uname", "pword"})
	@Test
	  // parameters la parameter name mattum than kudukanum data type kuduka kudathu
	//data type a method kulla kudukanum
	public void open_the_browser(String uname,String pword) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//String uname = null;
	//	String pword =null;
		
		//to call the pagesementsfor login class to perform the test using page factory with initelements (driver,class)
		PageFactory.initElements(driver,UdumeyLoginPage.class);
		
		UdumeyLoginPage.Login.click();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		UdumeyLoginPage.mail.sendKeys(uname);
		
		UdumeyLoginPage.key.sendKeys(pword);
		
		UdumeyLoginPage.click.click();
		
		
		String Actual= driver.getTitle();
		String Expected="Online Courses - Anytime, Anywhere | Udemy";
		Assert.assertEquals(Actual, Expected);
		
		if(Actual.equalsIgnoreCase(Expected)) {
			System.out.println("Test is passed");}
			else {
				System.out.println("Test is failled");
			}
				
			}
		
		
	}
