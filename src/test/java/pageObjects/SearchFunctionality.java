package pageObjects;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import myPack.Classc;

public class SearchFunctionality extends Classc{
	@Test(priority=1)
public void search() {
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
	driver.findElement(By.xpath("(//input[@type='submit' and @value='Google Search'])[2]")).click();
}
}
