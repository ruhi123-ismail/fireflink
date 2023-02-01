package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/zeesh/Downloads/MultipleWindow.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String>windowhandles=driver.getWindowHandles();
		for(String handle:windowhandles) {
			driver.switchTo().window(handle);
			if(driver.getTitle().contains("olive")) {
				driver.close();
			}
		}
		
	}

}
