package jdi;

import base.jdi.JDISite;
import base.jdi.entities.User;
import com.epam.jdi.light.actions.ActionHelper;
import com.epam.jdi.light.driver.WebDriverFactory;
import com.epam.jdi.light.preconditions.WebPreconditions;
import com.epam.jdi.light.settings.WebSettings;
import com.epam.jdi.light.ui.html.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static base.jdi.entities.User.*;
import static com.epam.jdi.light.logger.LogLevels.INFO;

public class JdiSimpleExample {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        WebSettings.logger.setLogLevel(INFO);
        PageFactory.initElements(JDISite.class);
    }

//    @Test
//    public void simpleJdiTest() {
//        JDISite.indexPageJdi.open();
//        JDISite.indexPageJdi.login(PETER);
//    }

    @Test
    public void tableTestJdi() {
        JDISite.indexPageJdi.open();
        JDISite.indexPageJdi.login(PETER);
        JDISite.indexPageJdi.checklist.check("Fire");
    }


    @AfterSuite
    public void afterSuite() {
        WebDriverFactory.close();
    }

}
