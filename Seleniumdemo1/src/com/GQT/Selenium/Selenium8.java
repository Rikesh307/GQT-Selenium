/* script to display the title,current url from the gmail application either using chrome or firefox browser based on the input provided 
by the user ( using runtime polymorphism )*/
package com.GQT.Selenium;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Selenium8 {
	public static void test(WebDriver driver)
	{
		driver.get("https://www.gmail.com");
		String title =driver.getTitle();
		System.out.println(title);
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the browser name chrome|firefox");
Scanner scan = new Scanner (System.in);
String browser = scan.next();

if(browser.equals("chrome")) {
	WebDriver c = new ChromeDriver();
	test(c);
}
else if(browser.equals("firefox")) {
	WebDriver f = new FirefoxDriver();
	test(f);
	
}
else {
	System.out.println("Invalid name.....try again ");
}
	}

}
