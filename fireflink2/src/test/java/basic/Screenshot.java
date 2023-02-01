package basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.landrover.in/index.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@aria-label='Go to slide 3']")).click();		
		
		driver.findElement(By.xpath("//button[@class='Pagination__pause Pagination__pause--animation']")).click();
	
		WebElement e3=driver.findElement(By.xpath("(//img[@alt='Evoque Parked In Front Of Building'])[1]"));
		File src=e3.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/car.png");
		FileUtils.copyFile(src,dest);
		driver.quit();
		
		
	}

}
