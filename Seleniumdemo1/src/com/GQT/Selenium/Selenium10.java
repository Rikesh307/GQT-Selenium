/*script to negivate facebook application and type the password in the password field using *id* locator  
 * HTML code for email WebElement 
 * ----------------------------------------
 * <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" 
 * placeholder="Password" aria-label="Password">
 */
package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
			WebElement e = driver.findElement(By.id("pass"));
			e.sendKeys("abiralvai");
			

	}

}
