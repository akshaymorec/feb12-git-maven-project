package com.test.mevandemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	  
	  @BeforeTest
	  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Akshay More\\mevandemo\\src\\Resource\\chromedriver.exe");
	  driver =new ChromeDriver();
	  System.out.println("Open Browser");
	  
	  driver.get("http://newtours.demoaut.com/");
	  }
	  @Test
	  public void f() {
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  System.out.println("Login Done");
	  
	  }

	  @AfterTest
	  public void afterTest() {
	  }}