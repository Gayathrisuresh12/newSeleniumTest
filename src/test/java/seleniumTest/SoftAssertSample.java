package seleniumTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSample extends Base{
	
	@Test
	public void softAssertSample() {
		


		String valueAfterColon = null ;
		String input = "Hello";	
		SoftAssert softassert = new SoftAssert();
		WebElement singleInputElement = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputElement.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String textMessage = yourMessageText.getText();
		
		int indexOfColon = textMessage.indexOf(':');
		 if (indexOfColon != -1) {        
	             valueAfterColon = textMessage.substring(indexOfColon + 1).trim();
	      
		 }
		 
		 softassert.assertEquals(valueAfterColon,input ,"Your message is not"+input );
		
		
			
		String classNameOfShowMsgButton = showMessageButton.getAttribute("class");
		Boolean isShowMsgButtonDisplayed= showMessageButton.isDisplayed();
		softassert.assertTrue(isShowMsgButtonDisplayed,"Show msg not displayed");
		softassert.assertAll();
	
		
	}

}
