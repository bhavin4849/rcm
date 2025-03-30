package rcm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestCaseBase {
	public static WebDriver driver;
	
	@BeforeMethod
	public  void setup() throws InterruptedException
	{
		
		//this.driver = new ChromeDriver();
	    driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://app.adit.com/auth/login");
		//Thread.sleep(3000);
	}
}
