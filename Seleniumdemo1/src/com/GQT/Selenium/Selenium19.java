/*WAS to nevigate to the gmail application and type email using "CSS LOCATOR" Advance locator substring endswith with "tagname[attribute name $= 'attribute value']".
 * 
 * HTML code for email
 * ------------------------------
 * <input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" 
 * name="identifier" value="" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
 */

package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.cssSelector("input[id $='erId']"));

		email.sendKeys("rikeshtongucha@gmail.com");
	}

}
