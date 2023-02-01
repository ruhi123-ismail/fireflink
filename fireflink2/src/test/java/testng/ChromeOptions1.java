package testng;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptions1 {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
        options.addArguments("start maximized");
		//options.addArguments("--headless");
		//options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		System.out.println("browser opened");
		
		
		
		
	}

}
