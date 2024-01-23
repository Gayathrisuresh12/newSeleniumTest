package seleniumTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementTest extends Base {
	
	

	public void webElementCommands() {

		String valueAfterColon = null ;
		String input = "Hello";	
		WebElement singleInputElement = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputElement.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		
		showMessageButton.click();
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String textMessage = yourMessageText.getText();
		
		int indexOfColon = textMessage.indexOf(':');
		 if (indexOfColon != -1) {        
	             valueAfterColon = textMessage.substring(indexOfColon + 1).trim();
	      
		 }
		 
//		 if(input.equals(valueAfterColon)) {
//				System.out.println("Text Verified");
//			}else {
//				System.out.println("Text not Verified");
//			}
		
		 
		 assertEquals(valueAfterColon,input ,"Your message is not"+input );
		
		
		String backgrndcolorOfShowMsgButton = showMessageButton.getCssValue("background-color");
		String fontWeightOfShowMsgButton = showMessageButton.getCssValue("font-weight");
		String colorOfShowMsgButton = showMessageButton.getCssValue("color");
		String borderRadiusOfShowMsgButton = showMessageButton.getCssValue("border-radius");
		
		String classNameOfShowMsgButton = showMessageButton.getAttribute("class");
		Boolean isShowMsgButtonDisplayed= showMessageButton.isDisplayed();
		assertTrue(isShowMsgButtonDisplayed,"Show msg not displayed");
	}

	public void webElementTwoInputFieldCommand() {
		String actualValue = null;
		Integer value1 = 5;
		Integer value2 = 2;

		Integer result = value1 + value2;

		WebElement twoInputElementA = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement twoInputElementB = driver.findElement(By.xpath("//input[@id='value-b']"));

		twoInputElementA.sendKeys(value1.toString());
		twoInputElementB.sendKeys(value2.toString());

		WebElement getButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		
		//Fluent Wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(getButton));

		getButton.click();

		WebElement resultMessage = driver.findElement(By.xpath("//div[@id='message-two']"));

		String twoInputResult = resultMessage.getText();
		
		
		int indexOfColon = twoInputResult.indexOf(':');
		 if (indexOfColon != -1) {        
	             actualValue = twoInputResult.substring(indexOfColon + 1).trim();
	      
		 }

		if (result.equals(Integer.parseInt(actualValue))){
			
			System.out.println("Result verified");
		
		
		}else {
			
			System.out.println("Result not verified");
		
		}
	}


	public static void main(String[] args) {
		WebElementTest webElementTest = new WebElementTest();
		webElementTest.initializeBrowser();
		webElementTest.webElementCommands();
//		webElementTest.webElementTwoInputFieldCommand();
		webElementTest.driverQuit();

	}

}
