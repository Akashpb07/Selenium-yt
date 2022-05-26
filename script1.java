package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\project\\chromedriver.exe");

		// Initializing the browser driver
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/watch?v=WzuJANOPLyQ"); 
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[3]/div[2]/ytd-button-renderer[1]/a[1]/tp-yt-paper-button[1]")).click();

		Thread.sleep(5000);
	
		//Enter Email ID
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rahul.jindal899");
		Thread.sleep(5000);
		
		//Click on Next Button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();	
		Thread.sleep(5000);
		
		//Enter Password 
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("7888568969");
		Thread.sleep(5000);
		
		//Click on Next button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();	
		Thread.sleep(15000);
		
		//Like the video
		driver.findElement(By.xpath("//ytd-toggle-button-renderer[1]//a[1]//yt-formatted-string[1]")).click();
		
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		//Click on Comment area
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-watch-flexy[1]/div[5]/div[1]/div[1]/ytd-comments[1]/ytd-item-section-renderer[1]/div[1]/ytd-comments-header-renderer[1]/div[5]/ytd-comment-simplebox-renderer[1]/div[1]")).click();

		//Enter Comment 
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-watch-flexy[1]/div[5]/div[1]/div[1]/ytd-comments[1]/ytd-item-section-renderer[1]/div[1]/ytd-comments-header-renderer[1]/div[5]/ytd-comment-simplebox-renderer[1]/div[3]/ytd-comment-dialog-renderer[1]/ytd-commentbox[1]/div[2]/div[1]/div[2]/tp-yt-paper-input-container[1]/div[2]/div[1]/div[1]/ytd-emoji-input[1]/yt-user-mention-autosuggest-input[1]/yt-formatted-string[1]/div[1]")).sendKeys("test1233");
	
		//Click on Comment button 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']//tp-yt-paper-button[@id='button']")).click();	
		

		//Done
	
	
	
	}

}
