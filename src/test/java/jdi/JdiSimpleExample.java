package jdi;

import base.jdi.JDISite;
import base.jdi.entities.User;
import com.epam.jdi.light.driver.WebDriverFactory;
import com.epam.jdi.light.ui.html.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static base.jdi.entities.User.*;

public class JdiSimpleExample {

//    IndexPageJdi indexPageJdi;
//    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
//        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.navigate().to("https://epam.github.io/JDI/index.html");
//        indexPageJdi = PageFactory.initElements(driver, IndexPageJdi.class);
        PageFactory.initElements(JDISite.class);
    }

    @Test
    public void simpleJdiTest() {
        JDISite.indexPageJdi.open();
        JDISite.indexPageJdi.login(PETER);
//        indexPageJdi.login("epam", "1234");
    }

    @AfterSuite
    public void afterSuite() {
        WebDriverFactory.close();
//        driver.close();
    }

}
