package week2.day2.ass2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.interactions.Actions;

public class ButtonActions {


	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();

		
		Thread.sleep(2000);
		WebElement w= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		boolean flag= w.isEnabled();
		System.out.println("flag value is: " +flag);
		if(flag==false) {
			System.out.println("Button is in Disabled state");
		}
		
		Thread.sleep(2000);
	    WebElement submit= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
		submit.getLocation();
	    System.out.println("x and y coordinates of Submit button is: " +submit.getLocation());
	    
	  //obtain color in rgba
	   String color =  driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
        System.out.println("rgba value of color is: " +color);
        // convert rgba to hex
        String s= Color.fromString(color).asHex();
        System.out.println("Background color of Save button is: " +s);
        
        int height = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize().getHeight();
        System.out.println("Height of Submit Button is: " +height);
        int width = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize().getWidth();
        System.out.println("Width of Submit Button is: " +width);
        
        WebElement mouseover= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
        String colorchange= mouseover.getCssValue("background-color");
        String c1= Color.fromString(colorchange).asHex();
        System.out.println("Color before mouse over: " +c1);
        Actions action=new Actions(driver);
        action.moveToElement(mouseover).perform();
        WebElement aftermouseover= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
        String colorchanged= aftermouseover.getCssValue("background-color");
       String c2=Color.fromString(colorchanged).asHex();
       System.out.println("Color after mouse over is: " +c2);
      
       
       driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
       Thread.sleep(2000);
       JavascriptExecutor j= (JavascriptExecutor) driver;
       String st= (String)j.executeScript ("document.getElementById('j_id1:javax.faces.ViewState:4').click();");
      // String st= (String) j.executeScript("return document.getElementById('j_id1:javax.faces.ViewState:4').value");
       System.out.println("hidden button is clicked " +st);
       
       
       List<WebElement> count= driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
       System.out.println("total no of rounded button is: " +count.size());
       
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		String tit= driver.getTitle();
		System.out.println("Title Page should be: " +tit);
		if(tit.contains("Dashboard")) {
			System.out.println("title page verified");
		}
       
	
		
		
		
       }
        
       
        
        
        
        
	}

