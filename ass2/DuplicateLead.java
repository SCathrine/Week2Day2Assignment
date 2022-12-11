package week2.day2.ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Cathrine");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Cat");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MCA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("My degree");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cat@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement wb= driver.findElement(By.id("createLeadForm_firstName"));
		wb.clear();
		WebElement w = driver.findElement(By.id("createLeadForm_firstName"));
		w.sendKeys("Angelique");
		System.out.println("Updated Firstname : " +w.getAttribute("value"));
		
		String title=driver.getTitle();
		System.out.println(title);

	}

}
