package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datapro1 {
	
	@DataProvider(name="testdata",parallel=true)
	public Object[][] getTestdata(){
		Object[][] data=new Object[2][2] ;
		data[0][0]="john";
		data[0][1]="tv";
		data[1][0]="Ramesh";
		data[1][1]="sm";
		return data;
		}

	
	@Test(dataProvider = "testdata")
	public void test1(String firstname,String lastname){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastname);
		driver.quit();
	}
		
	}


