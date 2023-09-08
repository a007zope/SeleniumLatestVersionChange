package sept2023framework.seleniumlatestversion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class UsingWait {

	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement LoginSymbol =driver.findElement(By.xpath("//div[@id=\"app\"]//div[@class='orangehrm-login-slot']//h5"));
		Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(1000)).withMessage("Hey Aditya the timeout you mentioned is expired");
		//w.until(ExpectedConditions.visibilityOf(LoginSymbol));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Welcome To Pune');");

		w.until(ExpectedConditions.alertIsPresent());	

		System.out.println("Test Successful");




	}

}
