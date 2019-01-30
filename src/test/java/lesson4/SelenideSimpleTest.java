package lesson4;

import base.SelenideBase;
import com.codeborne.selenide.Browsers;
import static com.codeborne.selenide.Condition.text;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SelenideSimpleTest extends SelenideBase {

    @Test
    public void simpleTest() {

        //1
        //2
        open("https://epam.github.io/JDI/index.html");

        //3
        assertEquals(getWebDriver().getTitle(), "Home Page");

        //4
        $("[id='user-icon']").click();
        $("[id='name']").sendKeys("epam");
        $("[id='password']").sendKeys("1234");
        $("[id='login-button']").click();

        $("#user-name").shouldHave(text("Piter Chailovskii"));

        //5
        close();
    }

}
