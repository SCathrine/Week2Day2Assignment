package week2.day2.ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		//Note: linktext will only work for <a> tag
        driver.findElement(By.xpath("//span[text()='Basic']")).click();
        driver.findElement(By.xpath("//span[text()='Ajax']")).click();		
        driver.findElement(By.xpath("//label[text()='Java']")).click();
        driver.findElement(By.xpath("//div[contains(@data-iconstates,'ui-icon ui-icon-closethick')]")).click();
        driver.findElement(By.xpath("//div[contains(@data-iconstates,'ui-icon ui-icon-closethick')]")).click();
        driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
        WebElement w= driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
        boolean flag= w.isSelected();
        System.out.println("checkbox is : " +flag);
        driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
        Thread.sleep(2000);
        
        WebElement w3= driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-items ui-selectcheckboxmenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li[1]"));
        w3.click();
        
        
	}

}
