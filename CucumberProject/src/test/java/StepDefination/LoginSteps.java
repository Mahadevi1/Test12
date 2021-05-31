package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
    public void user_is_on_login_page() 
    {
        System.out.println("User is on Login Page");
    }

    @When("enter username and password")
    public void enter_username_and_password() 
    {
         System.out.println("User have entered Username and Password");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println(" User Clicks on Login Page");
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println(" User is Navigated to Home Page");
    }
    
}

