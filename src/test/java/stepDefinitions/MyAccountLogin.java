package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountLogin {
	WebDriver driver;
	
	@Given("User navigated to login page")
	public void User_navigates_to_login_page() {
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
	}

	@When("User enters valid email address {string} into email fields")
	public void user_enters_valid_email_address_into_email_fields(String emailText) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(emailText);
   
	}

	@And("User has enters valid password {string} into password fields")
	public void user_has_enters_valid_password_into_password_fields(String passwordText) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(passwordText);
   
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
    
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Edit your account information']")).isDisplayed());

	}

	@When("User enters invalid email address {string} into email fields")
	public void user_enters_invalid_email_address_into_email_fields(String invalidEmailText) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(invalidEmailText);
    
	}

	@And("User enters invalid password {string} into passsword fields")
	public void user_enters_invalid_password_into_passsword_fields(String invalidPasswordText) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(invalidPasswordText);
  
	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
    
	}

	@And("User enters invalid password {string} into password fields")
	public void user_enters_invalid_password_into_password_fields(String invalidPasswordText) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(invalidPasswordText);
    
	}

	@And("User enters valid password {string} into password fields")
	public void user_enters_valid_password_into_password_fields(String passwordText) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(passwordText);
   
	}

	@When("User dont enter email address into email fields")
	public void user_dont_enter_email_address_into_email_fields() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("");
		
   
	}

	@And("User dont enter password into password fields")
	public void user_dont_enter_password_into_password_fields() {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("");
   
	}

}
