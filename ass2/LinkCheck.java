package week2.day2.ass2;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCheck {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.findElement(By.linkText("Go to Dashboard")).click();
		 driver.navigate().back();
		 
		//get url without clicking the link
		driver.get("https://www.leafground.com/link.xhtml");
		WebElement link= driver.findElement(By.linkText("Find the URL without clicking me."));
		System.out.println("URL is: " +link.getAttribute("href"));
		
        //find broken link using http request and response
	    WebElement broken= driver.findElement(By.linkText("Broken?"));	
	    String urllink= broken.getAttribute("href");
	    verifylink(urllink);
	     
	    Thread.sleep(2000);
	  //how many links in a webpage
	    
	    driver.findElement(By.linkText("How many links in this page?")).click();
	    Thread.sleep(2000);
	    List<WebElement> sizes= driver.findElements(By.xpath("//a"));
	    int count=sizes.size(); 
	    System.out.println("total number of links in this webpage is: " +count);
	    driver.navigate().back();
	    
	    //duplicate link
	    driver.findElement(By.linkText("Go to Dashboard")).click();
	    driver.navigate().back();
	    
	    //count layout link
	    driver.findElement(By.linkText("How many links in this layout?")).click();
	    List<WebElement> counts= driver.findElements(By.xpath("//div[@class='ui-rating-star ui-rating-star-on']"));
	    System.out.println("Total no of star tags :" +counts.size()); 
	}

	public static void verifylink(String linkurl) {
		
		
		try {
			
			URL url=new URL(linkurl);
			//Now we will be creating url connection and getting the response code
			
			HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
			httpurlconnect.setConnectTimeout(2000);
			httpurlconnect.connect();
			//get http response using getresponsecode()
			
		    if(httpurlconnect.getResponseCode()>=400) {
		    	System.out.println(linkurl+" - "+httpurlconnect.getResponseMessage()+" hence it is a broken link");
		    }
		    else {
		    	System.out.println(linkurl+"-"+httpurlconnect.getResponseMessage());
		    	
		    }
		}catch(Exception e) {
		
		
			
			
		
	}
		
		
		
	
	
	}
}

