package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathTest extends Base{
	
	public void locatorTest() {
		
		WebElement xpathElement = driver.findElement(By.xpath("//input[contains(@id,'single-input')]"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		WebElement xpathelement4 = driver.findElement(By.xpath("//button[contains(@class,'btn')]"));
		WebElement xpathelement5 = driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		
		
		WebElement startElement = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement startElement2 = driver.findElement(By.xpath("//input[starts-with(@placeholder,'M')]"));
		WebElement startElement3 = driver.findElement(By.xpath("//div[starts-with(@class,'my')]"));
		WebElement startElement4 = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Enter')]"));
		WebElement startElement5 = driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		
		
		WebElement textElement = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement textElement2 = driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement textElement3 = driver.findElement(By.xpath("//label[text()='Enter value A']"));
		WebElement textElement4 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement textElement5 = driver.findElement(By.xpath("//label[text()='Enter value B']"));
		
		WebElement parentElement = driver.findElement(By.xpath("//input[@id='single-input-field']/.."));
		WebElement parentElement2 = driver.findElement(By.xpath("//button[@id='button-one']/.."));
		WebElement parentElement3 = driver.findElement(By.xpath("//input[@id='value-a']/.."));
		WebElement parentElement4 = driver.findElement(By.xpath("//input[@class='form-control']/.."));
		WebElement parentElement5 = driver.findElement(By.xpath("//button[@id='button-two']/.."));
		
		
		WebElement childToParentElement = driver.findElement(By.xpath("//input[@id='value-a']//parent::div"));
		WebElement childToParentElement2= driver.findElement(By.xpath("//input[@id='value-b']//parent::div"));
		WebElement childToParentElement3 = driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
		WebElement childToParentElement4 = driver.findElement(By.xpath("//div[@id='message-one']//parent::form"));
		WebElement childToParentElement5 = driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));

	

		
	}
	
	

	public static void main(String[] args) {
		
		XpathTest xpathtest = new XpathTest();
		xpathtest.initializeBrowser();
//		xpathtest.locatorTest();
		xpathtest.driverQuit();

	}

}
