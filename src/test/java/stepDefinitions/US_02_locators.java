package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

import static com.codeborne.selenide.Condition.visible;

public class US_02_locators extends CommonPage {

    @And("the user inputs a username")
    public void theUserInputsAUsername() {
        test().userName.setValue("techproed");
    }

    @And("the user inputs a password")
    public void theUserInputsAPassword() {
        test().password.setValue("SuperSecretPassword");
    }

    @When("the user clicks the button Submit")
    public void theUserClicksTheButtonSubmit() {
        test().submitButton.click();
    }

    @Then("the user verifies that the text {string} is visible")
    public void theUserVerifiesThatTheTextIsVisible(String text) {
        test().loginMessage.shouldBe(visible);//Selenide Assertion (like Cypress)
    }
}
