/*Script to nevigate the facbook application and type the email in the email field and password in the password field using name locator
 * HTMLcode for email Web Element
 * -----------------------------------
 * <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
 *  placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
 *  
 *  HTML code for password Web Element 
 *  ------------------------------------
 *  <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" 
 *  placeholder="Password" aria-label="Password">
 * 
 */
package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
//
driver.manage().window().maximize();

driver.get("https://www.facebook.com");
 Thread.sleep(5000);
  
//Identifying the WebElement email field using name locator 
 WebElement e = driver.findElement(By.name("email"));
 
 //Passing the data to identified web element
 e.sendKeys("avash1000@icloud.com");
 
 //Identifying the WebElement password field using name locator 
 WebElement p = driver.findElement(By.name("pass"));
 
 //passing the data to the identified web element
 p.sendKeys("james@007");
 
 
	}

}
