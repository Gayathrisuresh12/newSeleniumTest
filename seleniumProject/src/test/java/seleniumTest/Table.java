package seleniumTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base{
	
//	@Test
//	public void verifyHeaderOfTable() {
//	    driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
//	    List<WebElement> tableHeaders = driver.findElements(By.xpath("//tr[@role='row']//th"));
//
//	    String expectedHeaders[] = {"Name", "Position", "Office", "Age", "Start date", "Salary"};
//
//	    for (WebElement webElement : tableHeaders) {
//	        String tableValue = webElement.getText();
//	        for (String expectedHeader : expectedHeaders) {
////	            if (tableValue.equals(expectedHeader)) {
////	                System.out.println("Header is: " + tableValue);
////	                
////	                break; 
////	            }
//	   		 assertEquals(tableValue,expectedHeaders ,"Header not expected" );
//
//	        }
//	    }
//	}
	
	@Test
	public void verifyHeaderOfTable() {
	    driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
	    List<WebElement> tableHeaders = driver.findElements(By.xpath("//tr[@role='row']//th"));

	    String expectedHeaders[] = {"Name", "Position", "Office", "Age", "Start date", "Salary"};

	    for (int i = 0; i < expectedHeaders.length; i++) {
	        String tableValue = tableHeaders.get(i).getText();
	        assertEquals(tableValue, expectedHeaders[i], "Header not expected: " + tableValue);
	    }
	}
	
	@Test
	public void verifyNameValue() {
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		 String nameValue = "Ashton Cox";
		Boolean flag = false;
		 
		 List<WebElement> rowValue = driver.findElements(By.xpath("//tr[@class='odd']//td"));
		 for (WebElement value : rowValue) {
			 String textValue = value.getText();
			 if(textValue.equals(nameValue)) {
				flag = true;
				break;
			 }
			
		}
		 assertTrue(flag, "Message not found");
		 
	}
	@Test
	public void assertSample() {
		boolean flag = false;
		int a=5,b=6;
		String s = null;
		String str ="abc";
		assertFalse(flag, "Flag is true");
		assertNotEquals(a, b,"a and b are equal");
		assertNull(s,"s is not null");
		assertNotNull(str, "str is not null");
		
	}

}
