package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrames1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("file:///C:/Users/zeesh/Downloads/iframe.html");
        driver.switchTo().frame("frame2");
        driver.findElement(By.xpath("//span[@class='bars']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Google']")).click();
	
}
}
