package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CommonPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class US_005_alerts extends CommonPage {

    @And("the user clicks the button Click for JS Prompt")
    public void theUserClicksTheButtonAlertPrompt() {

        test().jSPromptButton.click();
    }

    @And("the user inputs a text {string} into JS Prompt")
    public void theUserInputs(String arg0) {
        switchTo().alert().sendKeys(arg0);
    }

    @And("the user clicks the button OK")
    public void clicksTheButtonOK() {
        sleep(3000);
        switchTo().alert().accept(); //OK button nuna tikliyor
    }

    @Then("the user verifies that the Result text includes {string}")
    public void theUserVerifiesThatTResultTextIncludes(String arg0) {
    test().resultText.shouldHave(text(arg0));
    }
}
