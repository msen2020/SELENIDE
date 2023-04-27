package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;

public class US_08_explicitWait extends CommonPage {

    @And("the user clicks the button Start")
    public void theUserClicksTheButtonStart() {
    test().startButton.shouldBe(enabled,Duration.ofSeconds(10));
        test().startButton.click();
    }

    @Then("the user verifies that the text Hello World is visible")
    public void theUserVerifiesThatTheTextHelloWorldIsVisible() {
        test().helloWorldText.shouldBe(visible, Duration.ofSeconds(15));
        test().helloWorldText.shouldHave(text("Hello World!"), Duration.ofSeconds(15));

        Assert.assertEquals("Hello World!", test().helloWorldText.getText());
    }
}
