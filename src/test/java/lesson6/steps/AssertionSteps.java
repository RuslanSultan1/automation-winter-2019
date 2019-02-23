package lesson6.steps;

import base.lesson6.po.SelenideIndexPage;
import base.lesson6.entities.SuperHero;
import base.lesson6.entities.User;
import base.lesson6.po.SelenideUserTablePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

import static com.codeborne.selenide.Condition.text;

public class AssertionSteps {

    @Then("^User name should be '([^\"]*)'$")
    public void userNameShouldBe(String expectedUserName) {
        new SelenideIndexPage().getUserName().shouldBe(text(expectedUserName));
    }

    @Then("^User name should be as for user '([^\"]*)'$")
    public void userNameShouldBeAsForUser(String user) {
        new SelenideIndexPage().getUserName().shouldBe(text(User.getUserByUserName(user).username));
    }

    @And("^User table contains following values:$")
    public void userTableContainsFollowingValues(List<SuperHero> superHeroes) {
        new SelenideUserTablePage().checkSuperHeroes(superHeroes);
    }
}
