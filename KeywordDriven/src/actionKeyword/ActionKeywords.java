package actionKeyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	public static WebDriver driver;
	public static void openBrowser()
	{ 
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
	}

	 public static void navigate()
	 { 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://localhost:8585/");
	 }
	 public static void Input_Username()
	 {
		 driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
	 }
	 public static void Input_password()
	 {
		 	driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='1']")).click();
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='2']")).click();
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='3']")).click();
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='4']")).click();
	 }
	 public static void click_login()
	 {
		 driver.findElement(By.xpath("//div[@id='virtualKeyboard']//div//input[@class='button']")).click();
		 }
}

