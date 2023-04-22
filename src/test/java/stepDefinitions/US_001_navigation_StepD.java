package stepDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.*;

public class US_001_navigation_StepD {
    @Given("the user navigates to {string}")
    public void theUserNavigatesTo(String string) {
        open(string);
    }

//    @TestPage
//    public void userCanLoginByUsername() {
//        open("/login");
//        $(By.name("user.name")).setValue("johny");
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Waits until element disappears
//        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
//    }

    @And("the user waits for {int} seconds")
    public void theUserWaitsForSeconds(int int1) {
        sleep(int1* 1000L); //standard 4 seconds wait from Selenide
    }

    @And("the user navigates back")
    public void theUserNavigatesBack() {
    back();
    }

    @And("the user navigates forward")
    public void theUserNavigatesForward() {
    forward();
    }

    @And("the user refreshes the page")
    public void theUserRefreshesThePage() {
    refresh();
    }

    @And("the user holds the browser open")
    public void theUserHoldsTheBrowserOpen() {
        Configuration.holdBrowserOpen = true;
    }
}
