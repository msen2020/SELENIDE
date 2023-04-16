package utilities;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public class Driver {
    public void setUp() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        // Use the driver instance to interact with the browser
    }
}

