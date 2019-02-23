package lesson6.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.webdriver.WebDriverFactory;
import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class NavigationSteps {

    private static final String INDEX_PAGE_URL = "https://epam.github.io/JDI/index.html";

    @Given("^I open EPAM JDI site$")
    public void iOpenEpamJdiPage() {
        open(INDEX_PAGE_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
