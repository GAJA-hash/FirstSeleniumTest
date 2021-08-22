package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		runTest();
	}	
	//setBrowser
	//setBrowserConfig
	//runTest

	public static void setBrowser() {
		//browser = "Firefox";
		browser = "Chrome";

	}

	public static void setBrowserConfig() {
		String projectlocation = System.getProperty("user.dir");

		if (browser.contains("Firefox")) {
		/*Using gecko drive(Firefox) we need 2 lines of code. Below two different methods of execute using geckodriver*/
		//System.setProperty("webdriver.gecko.driver", "H:\JAVA\JAVA Projects\FirstSeleniumTest\SeleniumTest2\library\geckodriver\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", projectlocation+ "\\library\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver =new FirefoxDriver();
		}
		
		if (browser.contains("Chrome")) {
		/*Using Chrome driver we need only 1 line of code. Below two different methods of execute using chromedriver*/
		//System.setProperty("webdriver.chrome.driver", "H:\\JAVA\\JAVA Projects\\SeleniumTest2\\library\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectlocation+ "\\library\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	}
	public static void runTest() {
		driver.get(("https://selenium.dev/"));
		driver.quit();


	}
}

