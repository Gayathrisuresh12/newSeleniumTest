package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends Base {
	@Test
	public void alertSample() {

		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement greenClickMeButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		greenClickMeButton.click();
		
		String alertText = driver.switchTo().alert().getText(); //to get the alert message
		driver.switchTo().alert().accept(); //to click ok
		
		WebElement yellowClickMeButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		yellowClickMeButton.click();
		driver.switchTo().alert().dismiss(); //to click cancel
		
		WebElement clickForPromptBoxButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickForPromptBoxButton.click();
		driver.switchTo().alert().sendKeys("Hello"); //to enter input
		driver.switchTo().alert().accept(); //to click ok
	}

}
