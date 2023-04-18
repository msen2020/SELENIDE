package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class A0_LoginLogout extends CommonPage {

    public SelenideElement loginButton = $(By.xpath("(//a[@class='ant-dropdown-trigger BaseNavbar_dropBtn__zkmnE btn'])[1]"));
    public SelenideElement loginAsTherapistButton = $(By.xpath("//a[@href='/login']"));
    public SelenideElement calendarLink = $(By.xpath("(//a[@href='/dashboard/calendar'])[2]"));
}
