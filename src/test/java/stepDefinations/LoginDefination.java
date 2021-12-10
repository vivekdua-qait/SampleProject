package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginDefination {

	@Given("^User is on Landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("User is on Landing page");
	}

	@When("^User login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
		System.out.println("User login into application with "+username+ " and "+ password);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home page is populated");
	}
	
	@When("^User signup with following details$")
    public void user_signup_with_following_details(DataTable data) throws Throwable {
		List<List<String>> raw = data.asLists();
		System.out.println(raw.get(0).get(1));
		System.out.println(raw.get(1).get(1));
    }

	@And("^cards displayed are (.+)$")
    public void cards_displayed_are_something(String cardsvalue) throws Throwable {
		System.out.println("cards are displayed "+cardsvalue);
	}

}
