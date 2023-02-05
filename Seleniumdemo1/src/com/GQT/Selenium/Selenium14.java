/*WAS to nevigate to the facebook application and click on "forgotten password" link using "PARTIAL LINKTEST" locator
 * 
 * HTML text for forgotten password
 * ------------------------------------------
 * <a href="https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc1MTg2ODU0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_login">
 * Forgotten password?</a>
 */

package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		 Thread.sleep(3000);
		  
		 //Identifying the WebElement password field using name locator 
		 WebElement link = driver.findElement(By.partialLinkText("password"));
		 
		 //Passing the data to identified web element
		 link.click();
	}

}
