 package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {//ur parent
    public static WebDriver driver;
    public static Actions actions;

    public BaseClass() {}

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
            //driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://testautomationpractice.blogspot.com/");
        }
        return driver;
    }

    // Handle simple alert and accept
    public static void alertAccept() {
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();
    }

    public static void confromalert() {
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.dismiss();
    }

    // Handle prompt alert with input
    public static void alertSendKeys(String text) {
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.sendKeys(text);
        alert.accept();
    }

    // Move to an element (hover)
    public static void moveToElement(WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    // Double click an element
    public static void doubleClick(WebElement element) {
        actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

    // Drag and drop from one element to another
    public static void dragAndDrop(WebElement source, WebElement target) {
        actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
    }

    // Take a screenshot
    public static void takeScreenshot(String testname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dst = new File(".//target/screenshots/" + testname + ".jpg");
        FileUtils.copyFile(src, dst);
    }

    // Close the browser
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}


