package projectpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {
	public static WebDriver d;
	
	
	public WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apandey\\Desktop\\Readfiledata\\chromedriver.exe");
	d= new ChromeDriver();
		return d;

	}
	public void Jump() {
		System.out.println("i am jumping now");
		d.getTitle();
		
		
}
}
