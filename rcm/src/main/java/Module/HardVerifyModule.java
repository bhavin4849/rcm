package Module;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import PageObject.HardVerifyPageObject;


public class HardVerifyModule {

	WebDriver driver;
	//WebDriverWait wait;
	WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(50));
	
	FluentWait<WebDriver> fwait;
	
	public HardVerifyModule(WebDriver driver) 
	{
		//this.driver = driver;
		mywait = new WebDriverWait(driver,Duration.ofSeconds(50));
		/*
		 * fwait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(50)) .pollingEvery(Duration.ofSeconds(5))
		 * .ignoring(NoSuchElementException.class);
		 */
	}
	public void enterUserName(WebDriver driver)
	{
		driver.findElement(HardVerifyPageObject.username).sendKeys("rcmowner2@live");
	}
	public void enterPassword(WebDriver driver)
	{
		driver.findElement(HardVerifyPageObject.pass).sendKeys("wm@^jA114Yr^Grq6WtZP");
	}
	public void clickOnLoginbtn(WebDriver driver)
	{
		driver.findElement(HardVerifyPageObject.loginclick).click();
	}
	public void clickcallpopbtn(WebDriver driver)
	{
		WebElement softphoneclosebtn = mywait.until(ExpectedConditions.visibilityOfElementLocated(HardVerifyPageObject.callpopclosebtn));
		//WebElement softphoneclosebtn = driver.findElement(HardVerifyPageObject.callpopclosebtn);
		softphoneclosebtn.click();	
	}
	public void clickrcmApp(WebDriver driver)
	{
		WebElement clickrcmapp = mywait.until(ExpectedConditions.visibilityOfElementLocated(HardVerifyPageObject.rcmapp));
		//WebElement clickrcmapp = driver.findElement(HardVerifyPageObject.rcmapp);
		clickrcmapp.click();	
	}
	public void clicsidebar(WebDriver driver)
	{
		WebElement sidebar = mywait.until(ExpectedConditions.visibilityOfElementLocated(HardVerifyPageObject.clicksidebar));
		//WebElement sidebar = driver.findElement(HardVerifyPageObject.clicksidebar);
		sidebar.click();	
	}
	public void gotoNotVerified(WebDriver driver)
	{
		WebElement gotoNotverified = mywait.until(ExpectedConditions.visibilityOfElementLocated(HardVerifyPageObject.gotonotverified));
		//WebElement gotoNotverified = driver.findElement(HardVerifyPageObject.gotonotverified);
		gotoNotverified.click();	
	}
	public void locSelection(WebDriver driver) throws InterruptedException
	{
	
		/*
		 * WebElement locselect = fwait.until(new Function<WebDriver, WebElement>() {
		 * public WebElement apply(WebDriver driver) { return driver.findElement(By.
		 * xpath("//div[contains(@class,'sidebarnavbox ng-tns-c1579502206-')]//nav//div[14]//div"
		 * )); } }); locselect.click(); System.out.println(locselect.getText());
		 */
		
		
		/*
		 * WebElement locselect =
		 * mywait.until(ExpectedConditions.elementToBeClickable(HardVerifyPageObject.
		 * locselection)); System.out.println(locselect.getText()); locselect.click();
		 */
		 
		  Thread.sleep(5000); 
		  WebElement locselect =driver.findElement(HardVerifyPageObject.locselection);
		  System.out.println(locselect.getText());
		  locselect.click();
		 
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", locselect);
		 */
	}
	public void dateRange(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(10000);
		WebElement search = mywait.until(ExpectedConditions.visibilityOfElementLocated(HardVerifyPageObject.clicksearch));
		//WebElement search = driver.findElement(HardVerifyPageObject.clicksearch);
		search.sendKeys("Test Auto1");
	}
	public void clickNotVerified(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(10000);
		WebElement clicknotverified = mywait.until(ExpectedConditions.visibilityOfElementLocated(HardVerifyPageObject.clickonNotverified));
		//WebElement search = driver.findElement(HardVerifyPageObject.clicksearch);
		clicknotverified.click();
	}
	public void login(WebDriver driver)
	{
		enterUserName(driver);
		enterPassword(driver);
		clickOnLoginbtn(driver);
	}
	public boolean verifyVisibilityVerifyText(WebDriver driver)
	{
		return driver.findElement(HardVerifyPageObject.Verifytext).isDisplayed();
	}
	public boolean verifyVisibilitymarkascashText(WebDriver driver)
	{
		return driver.findElement(HardVerifyPageObject.markascashtext).isDisplayed();
	}
	public boolean verifyVisibilityreqinsText(WebDriver driver)
	{
		return driver.findElement(HardVerifyPageObject.reqinspatienttext).isDisplayed();
	}
	public boolean verifyVisibilityupdatepatientinsText(WebDriver driver)
	{
		return driver.findElement(HardVerifyPageObject.updatepatientinstext).isDisplayed();
	}
	public boolean verifyVisibilitymanuallyText(WebDriver driver)
	{
		return driver.findElement(HardVerifyPageObject.mauallysofttext).isDisplayed();
	}
	public boolean verifyVisibilitycancelText(WebDriver driver)
	{
		return driver.findElement(HardVerifyPageObject.cancelverificationtext).isDisplayed();
	}
	public void hardverify(WebDriver driver) throws InterruptedException
	{
		clickcallpopbtn(driver);
		clickrcmApp(driver);
		clicsidebar(driver);
		//gotoNotVerified(driver);
		locSelection(driver);
		dateRange(driver);
		clickNotVerified(driver);
	}
	
}
