package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonAndCheckBox extends Base{
	
	public void radioButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		WebElement maleButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		maleButton.click();
		
		Boolean isMaleButtonSelected = maleButton.isSelected();
	}
	
	public void findElementsSample() {
		List<WebElement> menu= driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//li"));
		
		
		for (WebElement menuItem : menu) {
			
			String menuText = menuItem.getText();
			String inputMenu = "Checkbox Demo";
			
			if(menuText.equals(inputMenu)) {
				menuItem.click();
				break;
			}
			
		}
	}
	
	

	public static void main(String[] args) {
		RadioButtonAndCheckBox radioButtonAndCheckBox = new RadioButtonAndCheckBox();
		radioButtonAndCheckBox.initializeBrowser();
//		radioButtonAndCheckBox.findElementsSample();
//		radioButtonAndCheckBox.radioButton();
		radioButtonAndCheckBox.driverQuit();
	}

}
