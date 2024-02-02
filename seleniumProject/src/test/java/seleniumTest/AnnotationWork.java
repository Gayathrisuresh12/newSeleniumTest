package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationWork {
	public WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        
        driver.manage().window().maximize();
    }

    @BeforeTest
    public void beforeTestcase() {
    	driver = new ChromeDriver();
        driver.get("https://selenium.obsqurazone.com/select-input.php");
    }

    @Test
    public void testCase() {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
        Select select = new Select(dropDown);
        select.selectByIndex(3);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
    
    @AfterTest
    public void afterTest() {
    	System.out.println("Report Generated");
    }
}
