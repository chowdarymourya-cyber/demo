package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class basicdeatilsdemosite {
	
public WebDriver driver;

public basicdeatilsdemosite(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
	@FindBy(xpath="//input[@placeholder=\"Enter Name\"]")
	WebElement namefiled;
	
	@FindBy(id="email")
	WebElement mailfiled;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(xpath="//textarea[@id=\"textarea\"]")
	WebElement addressfiled;
	
	@FindBy(xpath="//input[@type=\"radio\"][@value=\"male\"]")
	WebElement gendermale;
	
	public void entername(String name) {
		namefiled.sendKeys(name);
		
	}
	public void entermail(String mail) {
		mailfiled.sendKeys(mail);
	}
	public void phonenumber(String num) {
		phone.sendKeys(num);
		
	}
	public void address(String address) {
		addressfiled.sendKeys(address);
	}
	public void gender() {
		gendermale.click();
	}
	
	
	
}

	
	

