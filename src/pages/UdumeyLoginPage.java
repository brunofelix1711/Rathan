package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class UdumeyLoginPage implements ITestListener{
	
	@FindBy(xpath="//a[@href='https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F']")
	public static WebElement Login;
	
	@FindBy(id="email--1")
	public static WebElement mail;
	
	@FindBy(id="id_password")
	public static WebElement key;
	
	@FindBy(id="submit-id-submit")
	public static WebElement click;

	 @Override		
	    public void onFinish(ITestContext Result) 					
	    {		
	                		
	    }	
	 
	 @Override		
	    public void onStart(ITestContext Result)					
	    {		
	            		
	    }		
	 @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
	    {		
	    		
	    }		
	 
	 @Override		
	    public void onTestFailure(ITestResult Result) 					
	    {		
	    System.out.println("The name of the testcase failed is :"+Result.getName());					
	    }	

	 @Override		
	    public void onTestSkipped(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
	    }	
	 
	 @Override		
	    public void onTestStart(ITestResult Result)					
	    {		
	    System.out.println(Result.getName()+" test case started");					
	    }	
	 @Override		
	    public void onTestSuccess(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase passed is :"+Result.getName());					
	    }	
}
