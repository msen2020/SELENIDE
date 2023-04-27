package stepDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import pages.CommonPage;

public class US_10_crossBrowser extends CommonPage {

    @Given("the user selects the browser type as {string}")
    public void theUserSelectsTheBrowserTypeAs(String browserType) {
        switch (browserType) {
            case "headless" -> Configuration.headless = true;
            case "firefox" -> Configuration.browser = "firefox";
            case "edge" -> Configuration.browser = "edge";
            case "safari" -> Configuration.browser = "safari";
            case "opera" -> Configuration.browser = "opera";
            case "chrome" -> Configuration.browser = "chrome";
        }
    }
}

