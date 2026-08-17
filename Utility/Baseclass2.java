package Utility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass2 {

	
		 public static WebDriver driver;
		public static Actions action;
		 
		    

		    public Baseclass2() {}

		    // Initialize driver based on browser name
		    public static WebDriver getDriver(String browser) {
		        if (driver == null) {
		            switch (browser.toLowerCase()) {
		                case "chrome":
		                    WebDriverManager.chromedriver().setup();
		                    driver = new ChromeDriver();
		                    break;
		                case "firefox":
		                    WebDriverManager.firefoxdriver().setup();
		                    driver = new FirefoxDriver();
		                    break;
		                case "edge":
		                    WebDriverManager.edgedriver().setup();
		                    driver = new EdgeDriver();
		                    break;
		                default:
		                    System.out.println("Invalid browser name! Defaulting to Chrome.");
		                    WebDriverManager.chromedriver().setup();
		                    driver = new ChromeDriver();
		            }
		            driver.manage().window().maximize();
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		            driver.get("https://testautomationpractice.blogspot.com/");
		        }
		        return driver;
		    }

		    // Handle simple alert and accept
		    public static void alertAccept() {
		       Alert ale=driver.switchTo().alert();
		      String word= ale.getText();
		      System.out.println(word);
		       ale.accept();
		        
		       }
		    public static void confimationalert() {
		    	Alert ale=driver.switchTo().alert();
		    	 String word= ale.getText();
			      System.out.println(word);
			       ale.accept();
			       //ale.dismiss();
		    	
		    }
		    public static  void promtalert(String element) {
		    	Alert ale=driver.switchTo().alert();
		    	ale.sendKeys(element);
		    	ale.accept();
		    }
		    //
		   public static void mouseover(WebDriver driver, WebElement element) {
			action.moveToElement(element).build().perform();
		   }
		   
		   public static void Doubleclick(WebDriver driver ,WebElement element) {
			  action.doubleClick(element);
			   
		   }
		   public static void draganddrop(WebDriver driver, WebElement drag ,WebElement drop) {
			   action.dragAndDrop(drag,drop);
		   }
		   
		   public static void closeBrowser() {
		        if (driver != null) {
		            driver.quit();
		            driver = null;
		        }
		   }
}
		   
		   
		    
		    


