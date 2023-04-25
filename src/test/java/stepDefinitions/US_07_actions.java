package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.CommonPage;

import static com.codeborne.selenide.Selenide.actions;

public class US_07_actions extends CommonPage {

    @And("the user drags the target element and drop it")
    public void theUserDragsTheTargetElementAndDropIt() {
        actions().dragAndDrop(test().targetElement, test().targetPoint).build().perform();
    }

    @And("the user drags the target element to {int} by {int} and drops it")
    public void theUserDragsTheTargetElementToByAndDropsIt(int arg0, int arg1) {
        actions().dragAndDropBy(test().targetElement, arg0, arg1).build().perform();

    }

    @And("the user verifies the target element moved to {int} by {int} coordinates")
    public void theUserVerifiesTheTargetElementMovedToByCoordinates(int arg0, int arg1) {
        String styleValue = test().targetElement.getAttribute("Style");
        System.out.println(styleValue);
        Assert.assertTrue(styleValue.contains(String.valueOf(arg0)) && styleValue.contains(String.valueOf(arg1)));
    }
}
