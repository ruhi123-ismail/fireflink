package testngclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg2Test {
	
	@Test(groups="smoke")
	public void testcase1(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement disabled=driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='Disabled Text Field';", disabled);
		driver.close();
	}
	@Test
	public void sample3() {
		System.out.println("sample test case 3");
	}
}

