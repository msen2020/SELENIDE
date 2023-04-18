package stepDefinitions;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;

import java.util.Random;

public class Hooks {
    public static WebDriver driver;
    public static CommonPage commonPage;
    public static Faker faker = new Faker();
    public static Actions actions;
    static Random random = new Random();
    public static int randomNum = random.nextInt(100);


}
