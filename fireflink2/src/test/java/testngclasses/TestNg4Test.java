package testngclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg4Test {
	@Test(groups="regression")
	public void testcase3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("file:///C:/Users/zeesh/Downloads/iframe.html");
        driver.switchTo().frame("frame2");
        driver.findElement(By.xpath("//span[@class='bars']")).click();
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[text()='Google']")).click();
	    driver.close();
	}
	    @Test
        public void sample() {
        	System.out.println("sample test case");
        	
        }
        //driver.close();
}
	


