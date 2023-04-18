package stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CommonPage;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.*;

public class US_003_checkBox extends CommonPage {

    @Then("the user verifies that the text Checkboxes is visible")
    public void theUserVerifiesThatTheTextCheckboxesIsVisible() {
        test().checkboxesText.shouldBe(Condition.visible);
        test().checkbox1.shouldBe(Condition.checked);
    }

    @And("the user selects the {string}")
    public void selectsThe(String text) {

        if (text.equals("as") && !test().checkbox1.isSelected()) {
            test().checkbox1.click();
        }
        if (text.equals("") && !test().checkbox2.isSelected()) {
            test().checkbox2.shouldBe(Condition.checked);
            test().checkbox2.click();
        }
    }
}