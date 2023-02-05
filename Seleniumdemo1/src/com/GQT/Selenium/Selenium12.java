/*/*Script to nevigate the facbook application and type password in the password field using "CLASS" locator.
 * NOTE--> same className for id and password, at first id field  comes before password so it gives o/p in id field
 * HTMLcode for email Web Element
 * -----------------------------------
 * <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
 *  placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
 */
package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		 Thread.sleep(5000);
		  
		//Identifying the WebElement password field using name locator 
		 WebElement e = driver.findElement(By.className("inputtext"));
		 
		 //Passing the data to identified web element
		 e.sendKeys("ritesh");
}
}
