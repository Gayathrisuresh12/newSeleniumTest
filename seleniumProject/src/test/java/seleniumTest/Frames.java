package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames extends Base{
	
	@Test
	public void frameSample() {
		
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement element = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		element.click();
	}

}
