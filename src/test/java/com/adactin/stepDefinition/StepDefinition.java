package com.adactin.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver=RunnerClass.driver;

	@Given("^user Launch The Browser And Hit URL$")
	public void user_Launch_The_Browser_And_Hit_URL() throws Throwable {
		driver.get("https://adactinhotelapp.com/index.php");
	
	}

	@When("^user Enter The User Name Into The UserName Field$")
	public void user_Enter_The_User_Name_Into_The_UserName_Field() throws Throwable {
		WebElement Login = driver.findElement(By.xpath("//input[@id='username']"));
		Login.sendKeys("Devarajnsp");
			
	}

	@When("^user Enter The Password Into The Password Field$")
	public void user_Enter_The_Password_Into_The_Password_Field() throws Throwable {
		WebElement Pass = driver.findElement(By.xpath("//input[@id='password']"));
		Pass.sendKeys("654321");
	
	}

	@Then("^user Click The Login Button$")
	public void user_Click_The_Login_Button() throws Throwable {
		WebElement Button = driver.findElement(By.xpath("//input[@id='login']"));
		Button.click();
		Thread.sleep(3000);
	}
	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		Select Loc = new Select(driver.findElement(By.xpath("//select[@name='location']")));

		Loc.selectByValue("London");

	}

	@When("^user Select The Hotel Name$")
	public void user_Select_The_Hotel_Name() throws Throwable {
		Select Hot = new Select(driver.findElement(By.xpath("//select[@name='hotels']")));

		Hot.selectByValue("Hotel Sunshine");

	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
		Select Room = new Select(driver.findElement(By.xpath("//select[@name='room_type']")));

		Room.selectByValue("Super Deluxe");
		
		Select Qnt = new Select(driver.findElement(By.xpath("//select[@name='room_nos']")));

		Qnt.selectByValue("1");
		WebElement Datein = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		Datein.clear();
		Datein.sendKeys("28/09/2022");

		WebElement Dateout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		Dateout.clear();
		Dateout.sendKeys("30/09/2022");

		Select Nof = new Select(driver.findElement(By.xpath("//select[@id='adult_room']")));

		Nof.selectByValue("2");

		Select Child = new Select(driver.findElement(By.xpath("// select[@id='child_room']")));

		Child.selectByValue("4");

	}

	@Then("^user Click The Search Button$")
	public void user_Click_The_Search_Button() throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		Thread.sleep(3000);
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		WebElement HotelSelect = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));

		boolean Check = HotelSelect.isSelected();
		if (!Check) {
			HotelSelect.click();

			WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
			Continue.click();
			Thread.sleep(3000);
		}
	}

//	@Then("^user Click Continue Button$")
//	public void user_Click_Continue_Button() throws Throwable {
//	}

	@When("^user Enter The Name In First Name Field$")
	public void user_Enter_The_Name_In_First_Name_Field() throws Throwable {
		WebElement FName = driver.findElement(By.xpath("//input[@id='first_name']"));
		FName.sendKeys("Deva");
		

	}

	@When("^user Enter Last Name In Last Name Field$")
	public void user_Enter_Last_Name_In_Last_Name_Field() throws Throwable {
		WebElement LName = driver.findElement(By.xpath("//input[@id='last_name']"));
		LName.sendKeys("A");

	}

	@When("^user Enter Billing Address In Address Field$")
	public void user_Enter_Billing_Address_In_Address_Field() throws Throwable {
		WebElement AName = driver.findElement(By.xpath("//textarea[@id='address']"));
		AName.sendKeys("Arakonam");

	}

	@When("^user Enter Cc Number In Cc Field$")
	public void user_Enter_Cc_Number_In_Cc_Field() throws Throwable {
		WebElement Cc = driver.findElement(By.xpath("//input[@id='cc_num']"));
		Cc.sendKeys("12345678901234567");

	}

	@When("^user Enter Card Type In Card Type Field$")
	public void user_Enter_Card_Type_In_Card_Type_Field() throws Throwable {
		Select ccType = new Select(driver.findElement(By.xpath("//select[@id='cc_type']")));

		ccType.selectByValue("AMEX");

	}

	@When("^user Enter Expiry Date In Expiry Date Field$")
	
	public void user_Enter_Expiry_Date_In_Expiry_Date_Field() throws Throwable {
		Select Vmont = new Select(driver.findElement(By.xpath("//select[@id='cc_exp_month']")));

		Vmont.selectByValue("11");

	}

	@When("^user Enter Expiry Year Ib Expiry Year Field$")
	public void user_Enter_Expiry_Year_Ib_Expiry_Year_Field() throws Throwable {
		Select Vyr = new Select(driver.findElement(By.xpath("//select[@id='cc_exp_year']")));

		Vyr.selectByValue("2022");

	}

	@When("^user Enter Cvv In Cvv Field$")
	public void user_Enter_Cvv_In_Cvv_Field() throws Throwable {
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));

		cvv.sendKeys("123");

	}

	@Then("^user Click Book Now Button$")
	public void user_Click_Book_Now_Button() throws Throwable {
		WebElement now = driver.findElement(By.xpath("//input[@id='book_now']"));

		now.click();
		Thread.sleep(3000);

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
}


