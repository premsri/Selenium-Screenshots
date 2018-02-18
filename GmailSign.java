package com.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSign {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?#identifier");
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email.sendKeys("premsri2504@gmail.com");
		WebElement next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("**********");
		WebElement submit = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		submit.click();
		Thread.sleep(1000);
		WebElement compose = driver.findElement(By.xpath("//a[@class='WaidBe']"));
		compose.click();
		WebElement compose1 = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		compose1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("premsri2504@gmail.com");
		Thread.sleep(1000);
		WebElement subject = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		subject.sendKeys("Feb 16th task - Automated Mail using Selenium ");
		WebElement description = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
		description.sendKeys("Dear Sir \n" +
				"\n" 
				+"Please find below url for screenshots for Feb 16th Task \n" + " \n " +		
				"I tired something, if coding wrong pls correct me" + " \n" 
				+ "https://raw.githubusercontent.com/premsri/Selenium-Screenshots/master/Demoqa.png \n"
				+ "https://raw.githubusercontent.com/premsri/Selenium-Screenshots/master/fbsignup.png \n"
				+ "https://raw.githubusercontent.com/premsri/Selenium-Screenshots/master/gmailsignup.png \n"
				+ "https://raw.githubusercontent.com/premsri/Selenium-Screenshots/master/lakshninetbank.png \n"
				+ "https://raw.githubusercontent.com/premsri/Selenium-Screenshots/master/skype.png \n"
				+ "https://raw.githubusercontent.com/premsri/Selenium-Screenshots/master/twitter.png \n"
				+ "https://raw.githubusercontent.com/premsri/MyProject/master/Screenshot%20(21).png \n"
				+ "Thank you \n"
				+"Prem"

		);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();

	}
}