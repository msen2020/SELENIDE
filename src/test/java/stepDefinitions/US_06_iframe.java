package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CommonPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.url;

public class US_06_iframe extends CommonPage {

    @Then("the user verifies that the text iframe is visible")
    public void theUserVerifiesThatTheTextIframeIsVisible() {
        test().iframeText.shouldHave(text("iframe"));
    }

    @And("the user switches to the iframe {int}")
    public void theUserSwitchesToTheIframe(int frame) {
        switchTo().frame(frame - 1);
    }

    @And("the user clicks the link Back to TechProEducation.com")
    public void theUserClicksTheLinkBackToTechProEducationCom() {
        test().techProLink.click();
    }

    @Then("the user verifies that the page of the url is {string}")
    public void theUserVerifiesThatThePageOfTheUrlIs(String expectedUrl) {
    // Verify the URL
        if (url().equals(expectedUrl)) {
            System.out.println("URL is correct");
        } else {
            System.out.println("URL is incorrect");
        }
        System.out.println(expectedUrl);
    }

    @And("the user switches to the window {int}")
    public void theUserSwitchesToTheWindow(int expectedWindow) {
    switchTo().window(expectedWindow-1);
        System.out.println(url());
    }
}
