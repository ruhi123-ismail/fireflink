package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pompractice {
	private WebDriver driver;
	public Pompractice(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Log in']") private WebElement LoginLink;
	@FindBy(xpath="//input[@id='Email']") private WebElement email;
	@FindBy(xpath="//input[@id='Password']") private WebElement password;
	@FindBy(xpath="//input[@id='RememberMe']") private WebElement Remember;
	@FindBy(xpath="//input[@class='button-1 login-button']") private WebElement loginButton;
	String time=LocalDateTime.now().toString();
	
	public WebDriver getDriver() {return driver;}
	public WebElement getLoginLink() {return LoginLink;}
	public WebElement getemail() {return email;}
	public WebElement getpassword() {return password;}
	public WebElement getRemember()  {return Remember;}
	public WebElement getloginButton() {return loginButton;}
	public void maximize() {driver.manage().window().maximize();}
	public void takesScreenshot(String filename)throws WebDriverException, IOException {
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("./Screenshot/"+filename+".png"));
	}
	public void quit()  {driver.quit();}
	
	
	}


