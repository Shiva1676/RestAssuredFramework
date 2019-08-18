/**
 * 
 */
package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class DataDrivenTesting {

	WebDriver driver;

	static XSSFCell cell;

	@BeforeClass
	public void startBrowser() {

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "Gen")
	public void test(String uname, String pass) throws IOException, InterruptedException {

		driver.findElement(By.id("txtUsername")).sendKeys(uname);

		driver.findElement(By.id("txtPassword")).sendKeys(pass);

		System.out.println(uname + " " + pass);

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.partialLinkText("Welcome")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

	}

	@DataProvider(name = "Gen")
	public static Object[][] getData() throws Exception {

		String path = System.getProperty("user.dir") + "/TestData/LoginData.xlsx";

		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		int rows = wb.getSheet("Sheet1").getPhysicalNumberOfRows();

		// int columns =
		// wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();

		int columns = wb.getSheet("Sheet1").getRow(0).getLastCellNum();

		Object arr[][] = new Object[rows][columns];

		System.out.println(rows + " Columns are" + columns);

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				// arr[i][j] = wb.getSheet("Sheet1").getRow(i).getCell(j);

				cell = wb.getSheet("Sheet1").getRow(i).getCell(j);

				DataFormatter df = new DataFormatter();
				arr[i][j] = df.formatCellValue(cell);

			}

		}

		return arr;

	}

}
