package PageObject;

import org.openqa.selenium.By;
public class HardVerifyPageObject 
{
	public static By username = By.xpath("//input[@id='mat-input-0']");
	public static By pass = By.xpath("//input[@id='mat-input-1']");
	public static By loginclick = By.xpath("//span[@class='mdc-button__label' and text()='Login']");
	//callpop btn
	public static By callpopclosebtn =By.xpath("//mat-icon[normalize-space()='close']");
	//click rcm app from dashboard
	public static By rcmapp =By.xpath("//span[@class='ng-tns-c3066347105-4' and text()='RCM']");
	//Select hamburger icon from sidebar
	public static By clicksidebar = By.xpath("//div[contains(@class,'arrow-icon-sidebar ng-tns-c1579502206-')]");
	public static By gotonotverified = By.xpath("//span[@class='mdc-tab__text-label'][normalize-space()='Not Verified']");
	public static By locselection = By.xpath("//div[contains(@class,'sidebarnavbox ng-tns-c1579502206-')]//div[13]");
	public static By clicksearch = By.xpath("//div[@class='table-searchbox d-flex']//div[@class='search-input-wrapper']//input[contains(@id, 'mat-input-')]");
	public static By clickonNotverified = By.xpath("//td[@class='mat-mdc-cell mdc-data-table__cell cdk-cell cdk-column-verification_status mat-column-verification_status ng-star-inserted']");
	public static By Verifytext = By.xpath("//div[@class='popup-list ng-star-inserted']//ul//li[1]");
	public static By markascashtext = By.xpath("//div[@class='popup-list ng-star-inserted']//ul//li[2]");
	public static By reqinspatienttext = By.xpath("//div[@class='popup-list ng-star-inserted']//ul//li[3]");
	public static By updatepatientinstext = By.xpath("//div[@class='popup-list ng-star-inserted']//ul//li[4]");
	public static By mauallysofttext = By.xpath("//div[@class='popup-list ng-star-inserted']//ul//li[5]");
	public static By cancelverificationtext = By.xpath("//div[@class='popup-list ng-star-inserted']//ul//li[6]");
}
//div[contains(@class,'sidebarnavbox ng-tns-c1579502206-')]//div[13]//a[contains(@class,'nav-link ng-tns-c1579502206-')]locselec
//div[contains(@class,'icon-inner-block ng-tns-c1579502206-')]sidebar