package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver driver=null;

	@Given("browser is open")
	public void browser_is_open() 
	{
		System.out.println("Browser is Open");
		String projectpath=System.getProperty("user.dir");;
		System.out.println("Project path="+projectpath);

		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");  // Double back \\ slash will work only on windows,but single / slash will work on all system
		driver=new ChromeDriver();;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println(" User is on google search page");
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() 
	{
		System.out.println("User enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
	}

	@And("click on enter")
	public void click_on_enter() throws InterruptedException 
	{
		System.out.println("click on enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result()
	{
		driver.getPageSource().contains("Test automation Software");
		driver.close();
		//driver.quit();
	}
}
