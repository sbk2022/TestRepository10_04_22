package testPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satye\\Desktop\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Netcracker Technology - Wikipedia");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\satye\\Documents\\NewWorkspace\\TestProject\\ScreenShots\\screenshot1.jpg");
		
		FileHandler.copy(src, dest);
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
		String sourceUrl = "https://en.wikipedia.org/wiki/Netcracker_Technology";
		String targetUrl = driver.getCurrentUrl();
		
		if(sourceUrl.equals(targetUrl)) {
			System.out.println("Target URL is matching with Source URL");
		} else {
			System.out.println("Target URL is NOT matching with Source URL");
		}
		
		driver.quit();
	}
}
