/*WAS to nevigate to the facebook application and type email using "CSS LOCATOR" locator[tag#id]
 * 
 * * HTMLcode for email Web Element
 * -----------------------------------
 * <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
 *  placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
*/
package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		 Thread.sleep(3000);
		  
		 //Identifying the WebElement password field using name locator 
		 WebElement email = driver.findElement(By.cssSelector("input#email"));
		 
		 //Passing the data to identified web element
		 email.sendKeys("rtongucha@gmail.com");
	}

}
