package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Account_creation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		driver.findElement(By.name("FirstName")).sendKeys("automation");
		driver.findElement(By.id("LastName")).sendKeys("Test");
		driver.findElement(By.name("GmailAddress")).sendKeys("automationtest369");
		driver.findElement(By.name("Passwd")).sendKeys("testingautomation");
		driver.findElement(By.name("PasswdAgain")).sendKeys("testingautomation");
		driver.findElement(By.xpath("//*[@id=\"BirthMonth\"]/div")).sendKeys("January");
		Thread.sleep(3000);
		driver.findElement(By.id("BirthDay")).sendKeys("01");
		driver.findElement(By.id("BirthYear")).sendKeys("1991");
		driver.findElement(By.xpath("//*[@id=\"Gender\"]/div")).sendKeys("rather not say");
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"RecoveryPhoneNumber\"]")).sendKeys("3042828281");
		driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("pllmht8@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"CountryCode\"]/div[1]")).sendKeys("india");
		Thread.sleep(3000);
		driver.findElement(By.name("submitbutton")).click();
		//driver.manage().window().maximize();
		for (int i = 0; i < 50; i++) 
		{
		driver.findElement(By.xpath("//*[@id=\"tos-scroll-button\"]")).click();
		}
		Thread.sleep(3000);
		if(!driver.findElement(By.name("iagreebutton")).isDisplayed());
		{
			driver.findElement(By.name("iagreebutton")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"signupidvmethod-voice\"]")).click();
	//else if
//		{
//			driver.findElement(By.xpath("//*[@id=\"tos-scroll-button\"]")).click();
//		}

		
	} 

}
