package stepDefinitions;

import io.cucumber.java.en.And;
import pages.CommonPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class US_11_javaScriptExecutor extends CommonPage {

    @And("the user clicks the link FAQ")
    public void theUserClicksTheLinkFAQ() {
        test().faqLink.shouldBe(visible,Duration.ofSeconds(15));
        executeJavaScript("arguments[0].scrollIntoView(true);",test().faqLink);
        test().faqLink.shouldBe(enabled,Duration.ofSeconds(15));
        test().faqLink.click();
    }
}

