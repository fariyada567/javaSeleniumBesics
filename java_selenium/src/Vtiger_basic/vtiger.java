package Vtiger_basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.get("https://www.youtube.com");
	driver.get("http://localhost:8888");
		Thread.sleep(5000);
//		driver.get("https://www.Facebook.com");
//		driver.get("https://www.meesho.com/");
		
	}

}
