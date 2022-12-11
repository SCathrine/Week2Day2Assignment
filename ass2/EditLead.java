package week2.day2.ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys("cathrine");
		driver.findElement(By.xpath("//button[1][contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		WebElement w1= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a[text()='tcs']"));
		String s= w1.getText();
		System.out.println("Company Name: " +s);
		Thread.sleep(2000);
		WebElement w= driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[text()='16445']"));
		w.click();
		
		String s2=driver.getTitle();
		System.out.println(s2);
		String s3= "View Lead | opentaps CRM";
	
        if(s2.contains(s3)) {
        	System.out.println("Title Page Verified");
        }else {
        	System.out.println("Mismatch in Title of the Page");
        }
        
        
        driver.findElement(By.linkText("Edit")).click();
        
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("spi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        WebElement w3= driver.findElement(By.id("viewLead_companyName_sp"));
        String s4=w3.getText();
         if(s4.contains("spi")) {
        	System.out.println("updated company name is: " +s4);
        }else {
        	System.out.println("Company name not updated");
        }
         driver.close();
	}

}
