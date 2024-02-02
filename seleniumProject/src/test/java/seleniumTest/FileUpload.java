package seleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FileUpload extends Base{
	
	@Test
	public void fileUploadSample() {
		Faker faker = new Faker();
		String name = faker.name().firstName();
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFileButton.sendKeys("C:\\Users\\Techh\\OneDrive\\Desktop\\Gayathri\\javapgm\\Note21Jan.pdf");
	}

	@Test
	public void fileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfFileButton = driver.findElement(By.xpath("//div[@id='uploader']//a[@class='uploader__btn tooltip--left active']"));
		selectPdfFileButton.click();
		StringSelection ss = new StringSelection("C:\\Users\\HP\\Downloads\\QA_Testing Questions.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}