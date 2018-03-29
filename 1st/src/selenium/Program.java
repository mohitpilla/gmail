package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		String firstname = "automation";
		String lastname = "test";
		String mailid = "automationtest369";
		String password = "testingautomation";
		String birthmonth;
		String birthday;
		String birthyear;
		String gender;
		String phonenumber;
		String recoveryemail;
		String countrycode;
		
		// testing develop branch
		
		//develop commit 2

		WebDriver driver = new SafariDriver();

		driver.get("https://accounts.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text() = 'More options']")).click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"initialView\"]/div[2]/div[3]/div/div/content[1]")));
		option.click();
		option.clear();
		Thread.sleep(5000);

		driver.findElement(By.name("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.name("GmailAddress")).sendKeys(mailid);
		driver.findElement(By.name("Passwd")).sendKeys(password);
		driver.findElement(By.name("PasswdAgain")).sendKeys("testingautomation");
		driver.findElement(By.xpath("//*[@id=\"BirthMonth\"]/div")).sendKeys("January");
		driver.findElement(By.id("BirthDay")).sendKeys("01");
		driver.findElement(By.id("BirthYear")).sendKeys("1991");
		driver.findElement(By.xpath("//*[@id=\"Gender\"]/div")).sendKeys("rather not say");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"RecoveryPhoneNumber\"]")).sendKeys("3042828281");
		driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("pllmht8@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"CountryCode\"]/div[1]")).sendKeys("india");
		Thread.sleep(3000);
		driver.findElement(By.name("submitbutton")).click();
		Thread.sleep(3000);
		for (int i = 0; i < 50; i++) {
			driver.findElement(By.xpath("//*[@id=\"tos-scroll-button\"]")).click();
		}
		Thread.sleep(3000);
		if (!driver.findElement(By.name("iagreebutton")).isDisplayed())
			;
		{
			driver.findElement(By.name("iagreebutton")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"signupidvmethod-voice\"]")).click();

	}

}
