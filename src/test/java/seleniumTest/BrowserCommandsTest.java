package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCommandsTest extends Base {
	
	
	
	public void locatorTest() {
		
		WebElement showId = driver.findElement(By.id("value-a"));
		WebElement showId2 = driver.findElement(By.id("value-b"));
		WebElement showId3 = driver.findElement(By.id("button-two"));
		WebElement showId4 =  driver.findElement(By.id("message-two"));
		WebElement showId5 =  driver.findElement(By.id("single-input-field"));
		
		WebElement showclass = driver.findElement(By.className("card-header"));
		WebElement showclass2 = driver.findElement(By.className("form-control"));
		WebElement showclass3 = driver.findElement(By.className("btn btn-primary"));
		WebElement showclass4 = driver.findElement(By.className("my-2"));
		WebElement showclass5 = driver.findElement(By.className("clearfix"));
		
		
		WebElement linkElement = driver.findElement(By.linkText("Home"));
		WebElement linkElement2 = driver.findElement(By.linkText("Select Input"));
		WebElement linkElement3 = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement linkElement4 = driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement linkElement5 = driver.findElement(By.linkText("Jquery Select2"));
		
		WebElement xpathElement = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//a[@href='select-input.php']"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//a[@href='ajax-form-submit.php']"));

		
		
	}

	public static void main(String[] args) {
		BrowserCommandsTest browsercommandstest = new BrowserCommandsTest();
		browsercommandstest.initializeBrowser();
//		browsercommandstest.navigateCommands();
		browsercommandstest.locatorTest();
		browsercommandstest.driverQuit();

	}

}
