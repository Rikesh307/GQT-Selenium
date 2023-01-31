//script to verify the title of gmail application 
package com.GQT.Selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {

	public static void main(String[]args) throws InterruptedException {
		
		System.out.println("enter the title:");
		Scanner sc = new Scanner (System.in);
		String e_title = sc.next();
		//opening the chrome browser using setProperty
		System.setProperty("webdriver.chrome.driver", "C:\\selenium web driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//nevigate the gmail application 
		String url = "https://www.gmail.com";
		driver.get (url);
		
		//wait for 5 sec
		Thread.sleep(3000);
		
		//fetch the title of Gmail application
		String a_title = driver.getTitle();
		
		//Displaying both expected title and actual title
		System.out.println("Expected Title :"+e_title);
		System.out.println("Actual Title :"+a_title);
		
		//comparing the titles of the Gmail application
		if(e_title.equals(a_title))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		//close the browser
		driver.close();
	}
	}
