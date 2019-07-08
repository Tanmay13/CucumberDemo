package com.cucumber.demo.CucumberDemo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	@When("^user opens \"([^\"]*)\" browser$")
	public void user_opens_browser(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enters application url as \"([^\"]*)\"$")
	public void user_enters_application_url_as(String arg1) throws Throwable {
		System.out.println("welcome  to git hub");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	    
	}

	@When("^user waits \"([^\"]*)\" seconds to Login page to be loaded$")
	public void user_waits_seconds_to_Login_page_to_be_loaded(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user maximizes browser$")
	public void user_maximizes_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user is on Login page of Mercury Tours application$")
	public void user_is_on_Login_page_of_Mercury_Tours_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^user is on login page of Mercury Tours application$")
	public void user_is_on_login_page_of_Mercury_Tours_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user clicks on Sign In button$")
	public void user_clicks_on_Sign_In_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user is on Flight Finder page$")
	public void user_is_on_Flight_Finder_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user clicks on Sign off link$")
	public void user_clicks_on_Sign_off_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User access Sign on page$")
	public void user_access_Sign_on_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
