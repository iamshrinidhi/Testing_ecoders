package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingEcoder_employeepage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5000/employee");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title+" Employee page title\n");
		
		String url = driver.getCurrentUrl();
		System.out.println(url+" Employee page url\n");
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource+" Employee page pagesource\n");
		
		String expectedresult="Employee-homepage";
		if(expectedresult.equals(title)) {
			System.out.println("Title matched and test case pass");
		}
		else {
			System.out.println("Title not matched and test case fail");
		}
		Thread.sleep(3000);
	    driver.quit();
	}

}
