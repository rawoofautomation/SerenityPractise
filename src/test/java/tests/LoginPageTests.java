package tests;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.LoginPageSteps;


@RunWith(SerenityRunner.class)
public class LoginPageTests {

    @Steps
    LoginPageSteps loginPageSteps;

    @Managed()
    WebDriver browser;

    @Test
    public void applicationLoginTest()
    {
        loginPageSteps.launchApplication();
        loginPageSteps.userLogin();
        loginPageSteps.verifyLogin();
    }
}
