package miniProject;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverSetup {
	public static WebDriver driver;
	public static String baseUrl = "https://www.fb.com";
	/*
	 * 
	 * Method Name : getWebDriver
	 * Method Usage : To Open the ChromeDriver or EdgeDriver and also To Open the URL to test.
	 * Return : driver(WebDriver)
	 * 
	 */
	public static WebDriver getWebDriver(String browser) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
		}catch(Exception e) {
			System.out.println("Invalid Driver Setup");
			System.out.println(e);
		}
		driver.manage().window().maximize();
		System.out.println("Browser invoked");
		System.out.println("Browser Window maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
		driver.manage().deleteAllCookies();
		return driver;
	}
	/*
	 * 
	 * Method Name : driverClose
	 * Method Usage : To Close the opened ChromeDriver or EdgeDriver.
	 * Return : void
	 * 
	 */
	public static void driverClose() {

		driver.quit();
		System.out.println("Browser closed");

	}
}
