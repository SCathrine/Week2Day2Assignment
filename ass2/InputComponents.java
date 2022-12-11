package week2.day2.ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputComponents {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt88:name")).sendKeys("Cathrine");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(", India");
		WebElement w= driver.findElement(By.id("j_idt88:j_idt93"));
        boolean check=w.isEnabled();
        if(check==false) {
        	System.out.println("textbox is in disable state");
        }
        else {
        	System.out.println("it is enabled");
        }
        
        driver.findElement(By.id("j_idt88:j_idt95")).clear();
        WebElement w1= driver.findElement(By.id("j_idt88:j_idt97"));
        System.out.println(w1.getAttribute("value"));
        
    	//use key() to press enter
        driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("cat@gmail.com",Keys.TAB);
 		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("Im super cool girl:-)");
 		//use keys.control +a/c/z to select copy undo texts
 		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']//p")).sendKeys("please edit me and check",Keys.CONTROL +"a");
 		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103']//button[4][@class='ql-strike']")).click();
        driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    
       
        WebElement w2=driver.findElement(By.xpath("//label[text()='Username']"));
        System.out.println("location before: " +w2.getLocation());
        Thread.sleep(2000);
     
        driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']")).sendKeys("cathrine");
        Thread.sleep(2000);
      
        driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("2");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-down ui-corner-br ui-button ui-widget ui-state-default ui-button-text-only']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("10");
        String ss= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getAttribute("style");
        System.out.println("slider value changed to: " +ss);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']//p")).sendKeys("Customize me please..",Keys.CONTROL +"a");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124']//button[3]")).click();
        
        //PLS HELP ON:-
        //DID NOT COMPLETE D.O.B(CALENDAR), CHOOSE THIRD NAME, CLICK AND CONFRIM LABEL POSITION CHANGES
	}

}
