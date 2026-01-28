package Vtiger_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vtiger_1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		
		WebElement userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		userpassword.sendKeys("admin");
		
		WebElement login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		
		List<WebElement> alltextatpage = driver.findElements(By.xpath("//a"));
		for(int i=0; i<alltextatpage.size(); i++) {
			WebElement aaltext = alltextatpage.get(i);
			String textresult=aaltext.getText();
			if(textresult.equalsIgnoreCase("")) {
				
			}else {
				System.out.println("text  "+i+"  one is  "+textresult);
			}
			
		}
		
		

}
}
