package stepDefinitions;

import io.cucumber.java.en.And;
import pages.CommonPage;

import static com.codeborne.selenide.Selenide.sleep;

public class US_004_dropDown extends CommonPage {

    @And("the user selects the year {int} month {string} day {int}")
    public void theUserSelectsTheYearMonthDay(int year, String month, int day) {
        test().year.selectOption(String.valueOf(year));
        sleep(3000);
        test().month.selectOption(month);
        sleep(3000);
        test().day.selectOptionByValue(String.valueOf(day));
        sleep(3000);
    }
}
