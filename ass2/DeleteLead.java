package week2.day2.ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("01234567890");
		driver.findElement(By.xpath("//button[1][contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(2000);
		WebElement wb= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text = wb.getText();
		Thread.sleep(2000);
		System.out.println(text);
	
		wb.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();
		//driver.findElement(By.linkText("Phone")).click();
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("01234567890");
		
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.xpath("//button[1][contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text1 = b.getText();
		//System.out.println(text1);
		//String text2= "No records to display";
		if(text1.contains("No records to display"))
		
		{
			System.out.println("Lead id Deleted successfully");
		}else
		{
		
           System.out.println("not deleted");
	}
     
}
}