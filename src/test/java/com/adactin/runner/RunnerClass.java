package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature//adactin.feature",glue="com.adactin.stepDefinition")

public class RunnerClass {

 public static	WebDriver driver; 
 	 
 @BeforeClass
 public static void setup() {
	 System.setProperty("webdriver.chrome.driver", ".\\chrome106\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
 
}
 
 @AfterClass
 public static void tearDown() {
 
	 driver.close();
}
	
}
