package seleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base{
	
	@Test
	public void fileUploadSample() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFileButton.sendKeys("C:\\Users\\Techh\\OneDrive\\Desktop\\Gayathri\\javapgm\\Note21Jan.pdf");
	}

}