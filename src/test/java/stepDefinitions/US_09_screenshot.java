package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import pages.CommonPage;

import java.time.Duration;
import java.util.Date;

import static com.codeborne.selenide.Selenide.screenshot;

public class US_09_screenshot extends CommonPage {

    @And("the user takes the screenshot of the page")
    public void theUserTakesTheScreenshotOfThePage() {
        test().img.shouldBe(Condition.visible,Duration.ofSeconds(15));
//        Selenide.screenshot(new Date().toString());
        screenshot("image");
    }

    @And("the user takes the screenshot of the Hypnotes Image")
    public void theUserTakesTheScreenshotOfTheHypnotesImage() {
    test().img.screenshot();
    }
}
