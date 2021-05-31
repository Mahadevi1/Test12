package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTestPre {
	WebDriver driver =null;

	private By txtUN= By.name("uid");
	private By txtPWD= By.name("password");
	private By btnLogin= By.name("btnLogin");
	private By btnLogout= By.linkText("Log out");
	private By lblHomePageTittle= By.xpath("//h2[@class='barone']");

	public LoginTestPre(WebDriver driver) {
		this.driver=driver;
	}

	public void enterUsername(String userID) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(txtUN).sendKeys(userID);
	}

	public void enterPassword(String password) {
		driver.findElement(txtPWD).sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(btnLogin).click();
	}
	
	public void clickOnLogoutButton() {
		driver.findElement(btnLogout).click();
		
		driver.switchTo().alert().accept();
		
	}
	
	public void getHomePageTitle() {
		String strTitle=driver.findElement(lblHomePageTittle).getText();
		System.out.println("Home Page Title is:" +strTitle);
	}
}
