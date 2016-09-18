package GTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert {
   @Test
	public void alert() {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.ksrtc.in/site/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath(".//*[@id='Table_3']/tbody/tr[1]/td[2]/div/a"));
	ele.click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	
         String s1=driver.switchTo().alert().getText();
	     System.out.println(s1);
	     
	     driver.switchTo().alert().accept();
	     driver.quit();
	}

}
