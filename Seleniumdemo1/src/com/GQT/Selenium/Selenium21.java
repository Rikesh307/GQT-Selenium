/*<select style="margin:0px 0px 0px 5px;width:305px;" onchange="redirectPageAction()" name="topicItem" id="topicItem">
                                    <option value="index.html"> Choose Math Help Item ...</option>
                                    
                                    <option value="simpinterest.html">Interest, Simple</option>
                                    <input type="submit" value="Find the amount of interest">
                                </select>*/
package com.GQT.Selenium;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webmath.com");
		
		//click on general math
	
	Thread.sleep(3000);
	WebElement general_math_link = driver.findElement(By.partialLinkText("General Math"));
	general_math_link.click();
	
	//selecting the drop down and matching the desired option[interest,simple]
	Select drop_down = new Select(driver.findElement(By.cssSelector("Select[id *='topicItem']"))) ;
	drop_down.selectByVisibleText("Interest, Simple");
	
	//enter the principal amount
	WebElement p = driver.findElement(By.name("principal"));
	p.sendKeys("10000000");
	
	//enter the interest amount
		WebElement i = driver.findElement(By.name("interest"));
		i.sendKeys("20");
		
		//enter the year
		WebElement y = driver.findElement(By.name("desired_time"));
		y.sendKeys("1");
		
		//click on find amount of interest
		WebElement f = driver.findElement(By.cssSelector("input[value='Find the amount of interest']"));
		   f.click();
		   
		 driver.close();
		   
		
	}

}
