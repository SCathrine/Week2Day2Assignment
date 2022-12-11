package week2.day2.ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTag {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		// Note:- we cannot assign WebElement to Select class, hence create obj of select class
        Select s= new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
        Thread.sleep(2000);
        s.selectByVisibleText("Selenium");
        
        WebElement w = driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
        w.click();
        driver.findElement(By.xpath("//li[text()='India']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Select Values']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@data-label='இரண்டு']")).click();
        
	}

}
