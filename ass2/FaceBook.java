package week2.day2.ass2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("cathrine");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.name("reg_email__")).sendKeys("cathrineselvaraj@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("cathrine005");
		WebElement wb= driver.findElement(By.id("day"));
		Select dd=new Select(wb);
		dd.selectByIndex(4);
		WebElement wb1= driver.findElement(By.id("month"));
		Select dd1=new Select(wb1);
		dd1.selectByValue("11");
		WebElement wb2= driver.findElement(By.id("year"));
		Select dd2=new Select(wb2);
		dd2.selectByVisibleText("1992");
		driver.findElement(By.xpath("//input[contains(@value,'1')]")).click();
		
		
		
	}

}
