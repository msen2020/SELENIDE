package stepDefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CommonPage;

import java.util.Date;

public class Hooks {

    public static CommonPage commonPage;
    private static final String BASE_URL = "https://testcenter.techproeducation.com/";

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "chrome";
        Configuration.browserSize = String.valueOf(true);
        // Add any other configuration settings here
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        // Clear cookies and local storage after each test
        clearCookiesAndLocalStorage();
    }

    private void clearCookiesAndLocalStorage() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        Selenide.executeJavaScript("localStorage.clear();");
    }

    // Example of a custom SelenideLogger that logs each action and its result
    static class CustomLogger extends SelenideLogger implements stepDefinitions.CustomLogger {
        @Override
        public void beforeEvent(String s) {
            System.out.println(new Date() + " - Executing Selenide action: " + s);
        }

        @Override
        public void afterEvent(String s) {
            System.out.println(new Date() + " - Selenide action result: " + s);
        }
    }

    // Example of adding a cookie before each test
    public void addCookie(String name, String value) {
        WebDriver driver = WebDriverRunner.getWebDriver();
    }
}