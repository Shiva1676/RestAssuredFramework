/**
 * 
 */
package dataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class Testing {

	@Test
	public void test() {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

//		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();

		String id = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getAttribute("id");

		System.out.println(id);

		
		
		  if (id.contains("searchSystemUser_userName")) {
		  
		  driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("Hello");
		  }
		/*
		 * driver.findElement(By.xpath(
		 * "//input[@id='searchSystemUser_employeeName_empName']")).getAttribute
		 * (id);
		 * 
		 * if (status == true) {
		 * 
		 * driver.findElement(By.xpath(
		 * "//input[@id='searchSystemUser_employeeName_empName']")).sendKeys(
		 * empName); }
		 */
	}

}
