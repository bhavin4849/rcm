package rcm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Module.HardVerifyModule;
public class HardVerify extends TestCaseBase{

	@Test
	public void HardVerification() throws InterruptedException
	{
		HardVerifyModule hv = new HardVerifyModule(driver);
		hv.login(driver);
		hv.hardverify(driver);
		
		boolean isDispVerifytext = hv.verifyVisibilityVerifyText(driver);
		boolean ismarascashtext = hv.verifyVisibilitymarkascashText(driver);
		boolean isreqfrompatienttext = hv.verifyVisibilityreqinsText(driver);
		boolean isupdatepatienttext = hv.verifyVisibilityupdatepatientinsText(driver);
		boolean ismanuallytext = hv.verifyVisibilitymanuallyText(driver);
		boolean iscanceltext = hv.verifyVisibilitycancelText(driver);
		
		if(isDispVerifytext) {
			System.out.println("TestCase is Passed: Verify Text appears.");
		}else {
			System.out.println("TestCase is Failed: Verify text is not appears.");
		}
		if(isDispVerifytext) {
			System.out.println("TestCase is Passed: Mark As Cash Text appears.");
		}else {
			System.out.println("TestCase is Failed: Mark As Cash text is not appears.");
		}
		if(isreqfrompatienttext) {
			System.out.println("TestCase is Passed: Request ins. from Patient Text appears.");
		}else {
			System.out.println("TestCase is Failed: Request ins. from Patient text is not appears.");
		}
		if(isupdatepatienttext) {
			System.out.println("TestCase is Passed: Update Patient Insurance Text appears.");
		}else {
			System.out.println("TestCase is Failed: Update Patient Insurance text is not appears.");
		}
		if(isupdatepatienttext) {
			System.out.println("TestCase is Passed: Manually Run Soft Verification Text appears.");
		}else {
			System.out.println("TestCase is Failed: Manually Run Soft Verification text is not appears.");
		}
		if(isupdatepatienttext) {
			System.out.println("TestCase is Passed: Cancel Verification Text appears.");
		}else {
			System.out.println("TestCase is Failed: Cancel Verification text is not appears.");
		}

	}
	@Test
	public void hyperlinks() throws InterruptedException
	{
	
		HardVerifyModule hv = new HardVerifyModule(driver);
		hv.login(driver);
		hv.clickcallpopbtn(driver);
		Thread.sleep(5000);
		
		List <WebElement> links = driver.findElements(By.xpath("//div[contains(@class,'dashbordapplist ng-tns-c3066347105-1')]"));
		System.out.println("Total Links: "+links.size());
		
		for(WebElement ele : links)
		{
			System.out.println(ele.getText());
		}
	}
	
}