package com.crm.step_definitions;

import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class google_sd {

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        String url = "https://www.google.com/";
        Driver.getDriver().get(url);
    }
    @When("User requests page title")
    public void user_requests_page_title() {
        Driver.getDriver().getTitle();

    }
    @Then("User should receive {string}")
    public void user_should_receive(String string) {

        String actualPageTitle = Driver.getDriver().getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle = "Google";
        System.out.println(expectedPageTitle);

        System.out.println(actualPageTitle.equals(expectedPageTitle));
        Assert.assertEquals(actualPageTitle,expectedPageTitle);
    }

}
