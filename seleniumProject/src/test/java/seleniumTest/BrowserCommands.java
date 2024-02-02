package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCommands extends Base {
	
	public void navigateCommands() {
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.navigate().back();
		driver.navigate().forward();
	}
	
	public void browserCommands() {
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
	}
	
	public void locators() {
		
		WebElement showButton = driver.findElement(By.id("button-one"));
		WebElement headerElement = driver.findElement(By.className("card-header"));
		WebElement linkElement = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialLink = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement nameElement = driver.findElement(By.name("keywords"));
		WebElement cssElement = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssElement2 = driver.findElement(By.cssSelector("div.header-top"));
		WebElement cssElement3 = driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement xpathElement = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement tagElement = driver.findElement(By.tagName("div"));
		
	}

	public static void main(String[] args) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.locators();
//		browsercommands.browserCommands();
		browsercommands.navigateCommands();
		browsercommands.driverQuit();

	}

}
