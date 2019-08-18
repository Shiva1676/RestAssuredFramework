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
public class TestingStringUsage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String s = new String("Mohan");
		String s1 = new String("Mohan");
		String s2 = new String("Mohan");
		String s3 = new String("Mohan");
		String s4 = new String("Mohan");
		String s5 = new String("Mohan");
		String s6 = new String("Mohan");
		String s7 = new String("Mohan");
		String s8 = new String("Mohan");
		String s9 = new String("Mohan");
		String s10 = new String("Mohan");

		s1 = s1.concat("Shiva");

		System.out.println(s + " " + s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5 + " " + s6 + " " + s7 + " " + s8
				+ " " + s9 + " " + s10);

		System.out.println("**********************************************");

		String str = "Shiva";
		String str1 = "Shiva";
		String str2 = "Shiva";
		String str3 = "Shiva";
		String str4 = "Shiva";
		String str5 = "Shiva";
		String str6 = "Shiva";
		String str7 = "Shiva";
		String str8 = "Shiva";
		String str9 = "Shiva";
		
		int len = str.length();
		
		System.out.println("The length of the string is:"+len);

		str = str.concat("Ganesh");

		System.out.println(str + " " + str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5 + " " + str6 + " "
				+ str7 + " " + str8 + " " + str9);

		System.out.println("=====================================================");

		char[] ch = { 'j', 'a', 'v', 'a' };

		String string = new String(ch);

		System.out.println(string);

		System.out.println("=====================================================");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/");

		List<WebElement> allList = driver.findElements(By.xpath("//select[@id='tools']/option"));

		for (WebElement ele : allList) {

			String values = ele.getText();

			switch (values) {
			case "AutoIT":
				ele.click();

				Thread.sleep(500);

				System.out.println("The element which you selected is:" + values);

				break;

			case "Cucumber":
				ele.click();
				System.out.println("The element which you selected is:" + values);
				Thread.sleep(500);
				break;

			case "Docker":
				ele.click();
				System.out.println("The element which you selected is:" + values);
				Thread.sleep(500);
				break;

			case "Selenium":
				ele.click();
				System.out.println("The element which you selected is:" + values);
				Thread.sleep(500);
				break;

			}

		}

		driver.quit();
		
	}

}
