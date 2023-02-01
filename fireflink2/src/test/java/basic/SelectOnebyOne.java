
package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOnebyOne {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("syedaruhina08@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ruhina@1234");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[@href='/books'][1]")).click();
		WebElement e1=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select select=new Select(e1);
		List<WebElement>allOptions=select.getOptions();
		int i=0;
		System.out.println(allOptions.size());
		for (i=0;i<allOptions.size();i++) {
			select.selectByIndex(i);
		}

	}

	
}