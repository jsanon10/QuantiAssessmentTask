import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiftTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jjlas\\browserdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.theswiftcodes.com/malaysia/");
		
		//I've created 2 Lists here instead of 1 to get the necessary columns to be printed
	    List<WebElement> bankList = driver.findElements(By.xpath("//tbody/tr/td[@class = 'table-name']"));
	    List<WebElement> swiftList = driver.findElements(By.xpath("//tbody/tr/td[@class = 'table-swift']"));

	    //Using a for loop here to leverage the index counter to iterate through both List. I've used the bankList size as the condition for this loop
	    for (int i=0; i<bankList.size();i++){
	    
	      System.out.println("Bank: " + bankList.get(i).getText() + " ------- Swift: "+ swiftList.get(i).getText());
	    }	

	}

}
