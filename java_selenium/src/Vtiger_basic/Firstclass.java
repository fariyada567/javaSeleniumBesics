package Vtiger_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass {

	public static void main(String[] args) {
//		ChromeDriver driver=new ChromeDriver();//chromeBrowser launch
//		driver.get("http://localhost:8889/");// url hit
//		WebElement weuserbame=driver.findElement(By.name("user_name"));
//		weuserbame.sendKeys("admin");
//		WebElement wepwd=driver.findElement(By.name("user_password"));
//		wepwd.sendKeys("admin");
//		WebElement welogin=driver.findElement(By.id("submitButton"));
//		welogin.click();
		ChromeDriver driver=new ChromeDriver();//chromeBrowser launch
	driver.get("https://www.facebook.com/");// url hit
	WebElement webusername=driver.findElement(By.name("email"));
	webusername.sendKeys("fariyad");
	
	
	
		
	    
	}

}
