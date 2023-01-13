import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jjlas\\browserdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//I've extended the xpath to the parent here because HREF is at a level above Product Image in the hiearchy
	    List<WebElement> allImages = driver.findElements(By.xpath("//img[@class='product-image']//parent::a"));

	    int i = 0;
	     for(WebElement image: allImages) {
	    	 System.out.println("product's HREF is :" + allImages.get(i++).getAttribute("href"));
	     }
	}

}
