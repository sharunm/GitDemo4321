package DDrivenProgram1;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
	
	public void loginWithBothCorrectData(String uName,String pWord) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");  
		ChromeOptions co = new ChromeOptions();
	    co.addArguments(Arrays.asList("--remote-allow-origins=*",  "--lang=en_US"));

	    WebDriver driver=new ChromeDriver(co); 
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
