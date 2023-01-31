//Script to display page source code of Gmail application
package com.GQT.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//opening the chrome browser using setProperty
		System.setProperty("webdriver.chrome.driver", "C:\\selenium web driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//nevigate the gmail application 
		String url = "https://www.gmail.com";
		driver.get (url);
		
		//wait for 5 sec
		Thread.sleep(5000);
		
		//fetch the current Source code of Gmail application
		String p_source = driver.getPageSource();
		System.out.println(p_source);
		
		//close the browser
		driver.close();
	}

}
