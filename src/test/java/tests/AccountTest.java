package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.AccountPageSteps;
import steps.LoginPageSteps;

@RunWith(SerenityRunner.class)
public class AccountTest {

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    AccountPageSteps accountPageSteps ;

    @Managed()
    WebDriver browser;

    @Test
    public void verifyProductName()
    {
        loginPageSteps.launchApplication();
        loginPageSteps.userLogin();
        loginPageSteps.verifyLogin();
        accountPageSteps.validateAccountPage();
        Boolean flag =accountPageSteps.validateProduct("dress","Casual Dresses > Printed Dress");
        Assert.assertTrue(flag);
    }



}
