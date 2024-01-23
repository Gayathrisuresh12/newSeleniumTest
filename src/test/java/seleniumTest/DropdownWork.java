package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownWork extends Base{
	
	public void selectClassSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Red");
		select.selectByValue("Yellow");
		select.selectByIndex(3);
	}
	
	public void dropdownValue() {
		driver.navigate().to("https://www.selenium.dev/");
		WebElement dropdownTest = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle' and text() = 'English']"));
		dropdownTest.click();
		List<WebElement> dropdownValue = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li"));
	
		for (WebElement dropValue : dropdownValue) {
			String dropText = dropValue.getText();
			String inputText = "Português (Brasileiro)";
			
			if(dropText.equals(inputText)) {
				dropValue.click();
				break;
			}
		}
		
	}
	
	public void checkBoxButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox.click();
		Boolean checkTest = checkbox.isSelected();
	}
	

	public static void main(String[] args) {
		DropdownWork dropdownWork = new DropdownWork();
		dropdownWork.initializeBrowser();
//		dropdownWork.selectClassSample();
		dropdownWork.dropdownValue();
//		dropdownWork.checkBoxButton();
		dropdownWork.driverQuit();

		

	}

}
