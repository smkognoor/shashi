package GTest;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Cricket {
WebDriver driver;
	
	@Test
	public void crick(){
		driver=new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/ci/engine/match/800459.html");
       driver.manage().window().maximize();	
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       
      
  for(int i=2;i<=4;i++){
	  
	  WebElement shashi=driver.findElement(By.xpath("html/body/div[7]/div[2]/div[1]/div[2]/div/div/span["+2+"]"));
       WebElement ele2=driver.findElement(By.xpath("html/body/div[7]/div[2]/div[1]/div[2]/div/ul/li["+i+"]"));
       System.out.println(ele2);
      
    
      List<WebElement> ele4= ele2.findElements(By.tagName("td"));
       
      for(int j=0;j<ele4.size();j++){
    	 
    	  System.out.println(j+""+ele4.get(j).getText());
    	  System.out.println("-----------");
    	  
    	  
    	  
      }
		shashi.click();
		System.out.println("-----"+shashi.getSize()+"--------");
	}
  
}
	@Test(enabled=true)
	public void crick1(){
		
		WebElement ele1=driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[3]/a"));
		ele1.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for(int i=2;i<=4;i++){
			  
			  WebElement shashi=driver.findElement(By.xpath("html/body/div[7]/div[2]/div[1]/div[2]/div/div/span["+2+"]"));
		       WebElement ele2=driver.findElement(By.xpath("html/body/div[7]/div[2]/div[1]/div[2]/div/ul/li["+i+"]"));
		       System.out.println(ele2);
		      
		    
		      List<WebElement> ele4= ele2.findElements(By.tagName("td"));
		       
		      for(int j=0;j<ele4.size();j++){
		    	 
		    	  System.out.println(j+""+ele4.get(j).getText());
		    	  System.out.println("-----------");
		    	  
		    	  
		    	  
		      }
				shashi.click();
				System.out.println("-----"+shashi.getSize()+"--------");
			}	
		
	}
}
