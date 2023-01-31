/* script to display the title,current url from the gmail application either using chrome or firefox browser based on the input provided 
by the user (without using runtime polymorphism )*/
package com.GQT.Selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium7 {

	public static void test(FirefoxDriver driver) {
		driver.get("https://www.gmail.com");
		String title = driver.getTitle();
		System.out.println(title);
		String curl = driver.getCurrentUrl();
		System.out.println(curl);	
	}
	public static void test(ChromeDriver driver) {
		driver.get("https://www.gmail.com");
		String title = driver.getTitle();
		System.out.println(title);
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the browser name : chrome|firefox");
Scanner scan = new Scanner(System.in);
String browser = scan.next();

if(browser.equals("firefox"))
{
	FirefoxDriver f = new FirefoxDriver();
	test(f);
}

else if(browser.equals("chrome")) 
{
	ChromeDriver c = new ChromeDriver();
	test(c);
}
else{
	System.out.println("Ivalid browser name...... try again ");
	
}

}

}
