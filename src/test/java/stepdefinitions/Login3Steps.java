package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login3Steps {

    @Given("user is on login page")
    public void userisonloginpage() {
         System.out.println("userisonloginpage");
         //throw new PendingException();
    }

    @When("user enters Username and Password")
    public void userentersUsernameandPassword() {
         System.out.println("userentersUsernameandPassword");
      //  throw new PendingException();
    }

    @And("user clicks on login button")
    public void userclicksonloginbutton() {
       // throw new PendingException();
        System.out.println("userclicksonloginbutton");
    }

    @Then("user is navigated to Home Page")
    public void userisnavigatedtoHomePage() {
        System.out.println("userisnavigatedtoHomePage");
       // throw new PendingException();
    }



}

