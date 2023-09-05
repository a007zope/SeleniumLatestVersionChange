package sept2023framework.seleniumlatestversion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LaunchFirefox {
	
	public static void main(String[] args) {
		/*
		 * if you want to test with the older versions of firefox then use firefox options
		 * it will download the 115 geckodriver.exe + firefox(115)
		 * 
		 * 117.exe ----(current browser----stable)
		  we can also test our framework code with  future unstable releases of the browser
	
		 */
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBrowserVersion("nightly");
		
		WebDriver driver = new FirefoxDriver(fo);	
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//117.exe ----(current browser----stable)
		// we can also test our framework code with  future unstable releases of the browser
		
		/*
		 * for selenium manager we test below three use cases
		 * old
		 * current
		 * unstable/future
		 */
	
	}

}
