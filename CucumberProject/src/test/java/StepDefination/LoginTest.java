package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	WebDriver driver=null;
	LoginTestPre objLogin ;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		
		String projectpath=System.getProperty("user.dir");
		System.out.println("Project path="+projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");  // Double back \\ slash will work only on windows,but single / slash will work on all system
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("^User open (.*)$")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@And("^user enter (.*) and (.*)$")
	public void user_enter_userID_and_password(String userID,String password) throws InterruptedException {
		objLogin=new LoginTestPre(driver);
		Thread.sleep(5000);
		objLogin.enterUsername(userID);
		objLogin.enterPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
		objLogin.clickOnLoginButton();
	}

	@And("navigated to home page")
	public void navigated_to_home_page() {
		System.out.println("Navigated Home Page");
	}
	@Then("Print home page title")
	public void print_home_page_title() {
		objLogin.getHomePageTitle();
	}

	@And("User click on logout")
	public void user_click_on_logout() {
		objLogin.clickOnLogoutButton();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}
}
