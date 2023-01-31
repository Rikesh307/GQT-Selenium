//Script to maximize the chrome browser window
package com.GQT.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//
 System.setProperty("webdriver.chrome.driver","C:\\selenium web driver\\chromedriver.exe");
 ChromeDriver driver = new ChromeDriver();
 
//
 driver.manage().window().maximize();
 
 //nevigate the Url
 String url = "https://www.gmail.com";
 driver.get(url);
 
 //wait for 3 sec
 Thread.sleep(3000);
 
 //close the browser
 driver.close();
 
	}

}
