package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestSelenide extends CommonPage{


    public SelenideElement userName = $(By.id("exampleInputEmail1"));
    public SelenideElement password = $("#exampleInputPassword1");
    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement loginMessage = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));
    public SelenideElement checkboxesText = $(By.xpath("//h3[text()='Checkboxes']"));
    public SelenideElement checkbox1 = $(By.id("box1"));
    public SelenideElement checkbox2 = $(By.id("box2"));
    public SelenideElement red = $(By.id("red"));
    public SelenideElement football = $(By.id("football"));
    public SelenideElement water_polo = $(By.id("water_polo"));


}

