//program to identify both username and password WebElement
package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\GQT\\login.html");
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.xpath("html/body/input[1]"));
		un.sendKeys("rikesh");
		Thread.sleep(5000);
		WebElement pwd = driver.findElement(By.xpath("html/body/input[2]"));
		 pwd.sendKeys("123456789");
		//if we use close() function it close parent tab and if we use quit function it close() both parent and child tab
		 Thread.sleep(5000);
         driver.close();
		
	}

}
