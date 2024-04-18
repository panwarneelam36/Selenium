package orangeHRM_AUTO_Prac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module_File {
	WebDriver driver = new ChromeDriver();
	
	void navigate_functionality() throws InterruptedException, IOException{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		TakesScreenshot scrShot = (TakesScreenshot) driver;
		Thread.sleep(2000);

		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\OneDrive\\Pictures\\Screenshots\\Screenshot_1.png"));
		Thread.sleep(3000);
	}
	
	void username_functionality() throws InterruptedException, IOException {	
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		Thread.sleep(2000);
		
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\OneDrive\\Pictures\\Screenshots\\Screenshot_2.png"));
		Thread.sleep(2000);
	}
	
	void buzz_functionality() throws InterruptedException, IOException{
		
		WebElement buzz = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[12]"));
		buzz.click();
		Thread.sleep(2000);
		
		WebElement textfield = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		textfield.sendKeys("Neelam_Panwar");
		Thread.sleep(2000);
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		Thread.sleep(2000);
		
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\OneDrive\\Pictures\\Screenshots\\Screenshot_3.png"));
		Thread.sleep(2000);
	}
	
	void buzz_POST() throws InterruptedException, IOException {
		
		WebElement post = driver.findElement(By.xpath("//button[@type='submit']"));
		post.click();
		Thread.sleep(2000);
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		Thread.sleep(2000);
		
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\OneDrive\\Pictures\\Screenshots\\Screenshot_4.png"));
		Thread.sleep(2000);
	}
	
	void quit_functionality() {
		driver.quit();
	}
}
