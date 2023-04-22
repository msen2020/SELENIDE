package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CommonPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class US_006_iframe extends CommonPage {

    @And("the user clicks the button Click for JS Prompt")
    public void theUserClicksTheButtonAlertPrompt() {

        test().jSPromptButton.click();
    }

}
