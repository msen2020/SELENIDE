package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.*;

public class US_003_login extends CommonPage {

    @Given("the user navigates to TestSelenide page")
    public void theUserNavigatesToTestPage() {

    }

    @And("the user clicks the button Login")
    public void theUserClicksTheButtonLogin() {
        sleep(2000);
        loginLogout().loginButton.click();
    }

    @And("the user clicks option Therapist")
    public void theUserClicksOptionTherapist() {
        loginLogout().loginAsTherapistButton.click();
        sleep(2000);
    }

    @And("the user inputs a therapist email")
    public void theUserInputsATherapistEmail() {

    }

    @And("the user inputs a therapist password")
    public void theUserInputsATherapistPassword() {

    }

    @When("the user clicks the button Login for submit")
    public void theUserClicksTheButtonLoginForSubmit() {

    }

    @Then("the user verifies that the link Calendar is visible")
    public void theUserVerifiesThatTheLinkDashboardIsVisible() {
        loginLogout().calendarLink.setValue("calendar");
    }


}
