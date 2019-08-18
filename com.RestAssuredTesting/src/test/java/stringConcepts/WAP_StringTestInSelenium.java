/**
 * 
 */
package stringConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo
 *
 */
public class WAP_StringTestInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/");

		List<WebElement> list = driver.findElements(By.xpath("//select[@id='tools']/option"));

		for (WebElement ele : list) {

			String textValues = ele.getText();

			// System.out.println(textValues);

			if (textValues.equals("Selenium")) {

				ele.click();
				System.out.println("Element found");
			}

		}

	}

}
