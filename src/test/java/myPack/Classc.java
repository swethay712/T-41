package myPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Classc {
	public static WebDriver driver;
    @BeforeSuite
	public void OpenURL() {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}
	@AfterSuite
	public void closeURL() {
		driver.close();
	}

}
