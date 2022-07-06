package com.grupobancolombia.tests.stepdefinitions;

import com.grupobancolombia.automation.interactions.OpenTheBrowser;
import com.grupobancolombia.automation.ui.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GenerateReportStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor").can(BrowseTheWeb.with(driver));
    }

    @Given("^that a web user wants to generate report$")
    public void thatAWebUserWantsToGenerateReport() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(HomePage.URL));
    }

    @When("^he generates the report$")
    public void heGeneratesTheReport() {

    }

    @Then("^he should see the correct report$")
    public void heShouldSeeTheCorrectReport() {

    }
}
