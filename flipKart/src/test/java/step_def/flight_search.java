package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class flight_search {
    MainPage mainPage= new MainPage();

    @Given("^I am on Homepage$")
    public void i_am_on_Homepage() {
    String actual= mainPage.getUrl();

assertThat(actual,is(endsWith("/test/newtours/")));

    }

    @When("^I click on the flight$")
    public void i_click_on_the_flight(){

    mainPage.search();
    }

    @Then("^I able to see flight results$")
    public void i_able_to_see_flight_results(){


    }
}
