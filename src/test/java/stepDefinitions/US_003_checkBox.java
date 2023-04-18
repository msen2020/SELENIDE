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
    }

    @And("the user selects the {string}")
    public void selectsThe(String text) {

        if (text.equals("Checkbox 1") && !test().checkbox1.isSelected()) {
            test().checkbox1.click();
            test().checkbox1.shouldBe(Condition.checked);
        }
        if (text.equals("Checkbox 2") && !test().checkbox2.isSelected()) {
            test().checkbox2.shouldNotBe(Condition.checked);
            test().checkbox2.click();
            test().checkbox2.shouldBe(Condition.checked);
        }
        if (text.equals("Red") && !test().red.isSelected()) {
            test().red.click();
            test().red.shouldBe(Condition.checked);
        }
    }
}