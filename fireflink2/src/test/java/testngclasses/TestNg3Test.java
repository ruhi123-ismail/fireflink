package testngclasses;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg3Test {
	@Test(groups="smoke")
	public void testcase2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/zeesh/Downloads/MultipleWindow.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
//		Thread.sleep(3000);
//		Set<String>windowhandles=driver.getWindowHandles();
//		for(String handle:windowhandles) {
//			driver.switchTo().window(handle);
//			if(driver.getTitle().contains("olive")) {
//				driver.close();
//			}
	
      driver.close();
	}
	@Test
	public void sample2() {
		System.out.println("sample test case 2");
	}
}
