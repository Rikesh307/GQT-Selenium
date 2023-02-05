/*script to negivate facebook application and type the email in the email field using *ID* locator  
 * HTML code for email WebElement 
 * ----------------------------------------
 * <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
 *  placeholder="Email address or phone number" autofocus="1"aria-label="Email address or phone number">
 */
package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver  = new ChromeDriver ();

driver.manage().window().maximize();

driver.get("https://www.facebook.com");
 
Thread.sleep(5000);
 
WebElement e = driver.findElement(By.id("email"));
e.sendKeys("rikeshtongucha");

	}

}
