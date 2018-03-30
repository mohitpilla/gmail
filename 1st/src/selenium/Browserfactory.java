package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browserfactory {
	public static WebDriver open(String browserType) {

	if(browserType.equals("firefox"))
	{
	  System.setProperty("webdriver.gecko.driver","/Users/mohitpilla/shittyspace/geckodriver");
	  return new FirefoxDriver();
	}
    if(browserType.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "/Users/mohitpilla/shittyspace/chromedriver");
		return new ChromeDriver();
	}
    else
    {
    return new SafariDriver();
    }
}
}