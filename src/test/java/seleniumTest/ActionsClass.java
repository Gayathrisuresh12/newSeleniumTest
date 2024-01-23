package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base {
	
	@Test
	public void actionSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement dragElement = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dotElement = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		
		Actions actions = new Actions(driver) ;
//		actions.moveToElement(dragElement).build().perform();
//		actions.doubleClick(dragElement).build().perform();
//		actions.contextClick(dragElement).build().perform();
		actions.dragAndDrop(dragElement, dotElement).build().perform();
	}

}
