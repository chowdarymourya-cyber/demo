package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.basicdeatilsdemosite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demositesteps {

	public WebDriver driver;
	
	basicdeatilsdemosite obj;
	@Given("user opens the Test Automation Practice application")
	public void user_opens_the_test_automation_practice_application() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		obj=new basicdeatilsdemosite(driver);
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	@When("user enters name {string}")
	public void user_enters_name(String name) {
		obj.entername(name);
	    
	}
	@Then("user enters email {string}")
	public void user_enters_email(String mail) {
	    obj.entermail(mail);
	}
	@And("user enters phone number {string}")
	public void user_enters_phone_number(String num) {
	    obj.phonenumber(num);
	}
	@Then("user enters address {string}")
	public void user_enters_address(String address) {
	    obj.address(address);
	}
	@When("user selects gender {string}")
	public void user_selects_gender() {
		obj.gender();
	   
	}


	
	
}
