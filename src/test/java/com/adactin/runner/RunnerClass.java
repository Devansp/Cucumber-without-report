package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature//adactin.feature",glue="com.adactin.stepDefinition",
monochrome=true, dryRun=false, strict=true,
plugin= {"pretty","html:Reports/HTML_Report","json:Reports/Json_Report.json", 
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"})



// pretty gives additional information in console
//monochrome(true)-- removes special characters  //dry run(true) means---it will not run for matching snipptes also(5(matching)/10)
//strict(true)--it will through exception wen occurs

public class RunnerClass {

 public static	WebDriver driver; 
 	 
 @BeforeClass
 public static void setup() {
	// System.setProperty("webdriver.chrome.driver", ".\\chrome106\\chromedriver.exe");
	 WebDriverManager.chromedriver().create();
	 
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
 
}
 
 @AfterClass
 public static void tearDown() {
 
	 driver.close();
}
	
}
