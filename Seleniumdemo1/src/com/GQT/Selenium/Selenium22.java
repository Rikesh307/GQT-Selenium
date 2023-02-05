package com.GQT.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\GQT\\page1.html");
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.linkText("Go to child page"));
		link.click();
		
		Thread.sleep(5000);
		//if we use close() function it close both parent tab but if we use quit() function it close both parent and child tab
driver.quit();
		
	}

}
