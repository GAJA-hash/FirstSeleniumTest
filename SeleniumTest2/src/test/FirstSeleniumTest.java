package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {

		String projectlocation = System.getProperty("user.dir");

		/*Using gecko drive(Firefox) we need 2 lines of code. Below two different methods of execute using geckodriver*/
		//System.setProperty("webdriver.gecko.driver", "H:\JAVA\JAVA Projects\FirstSeleniumTest\SeleniumTest2\library\geckodriver\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", projectlocation+ "\\library\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver =new FirefoxDriver();

		/*Using Chrome driver we need only 1 line of code. Below two different methods of execute using chromedriver*/
		//System.setProperty("webdriver.chrome.driver", "H:\\JAVA\\JAVA Projects\\SeleniumTest2\\library\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", projectlocation+ "\\library\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		driver.get(("https://selenium.dev/"));
		driver.quit();

	}	
}



