package basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Pom {
	public static void main(String[] args) throws WebDriverException, IOException {
		WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Pompractice pom=new Pompractice(driver);
		pom.maximize();
		pom.getLoginLink().click();
		pom.getemail().sendKeys("syedaruhina08@gmail.com");
		pom.getpassword().sendKeys("Ruhina@1234");
		pom.getRemember().click();
		pom.getloginButton().click();
		pom.takesScreenshot("Screenshot");
		pom.quit();
		
		
	}

}
