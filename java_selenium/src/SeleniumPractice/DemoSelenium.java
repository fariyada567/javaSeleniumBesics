package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		///driver.get("https://www.google.com/");
		///driver.get("https://www.youtube.com/");
		///driver.get("https://www.bing.com/search?q=rojgar+result&gs");
		driver.get("https://go.microsoft.com/fwlink/?linkid=2242558");
	}

}
